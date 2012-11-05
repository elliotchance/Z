grammar Java;

options {
	output = AST;
}

tokens {
	K_ABSTRACT = 'abstract';
	K_ASSERT = 'assert';
	K_BOOLEAN = 'boolean';
	K_BREAK = 'break';
	K_BYTE = 'byte';
	K_CASE = 'case';
	K_CATCH = 'catch';
	K_CHAR = 'char';
	K_CLASS = 'class';
	K_CONTINUE = 'continue';
	K_DEFAULT = 'default';
	K_DO = 'do';
	K_DOUBLE = 'double';
	K_ELSE = 'else';
	K_ENUM = 'enum';
	K_EXTENDS = 'extends';
	K_FALSE = 'false';
	K_FINAL = 'final';
	K_FINALLY = 'finally';
	K_FLOAT = 'float';
	K_IF = 'if';
	K_INT = 'int';
	K_INTERFACE = 'interface';
	K_IMPLEMENTS = 'implements';
	K_IMPORT = 'import';
	K_INSTANCEOF = 'instanceof';
	K_FOR = 'for';
	K_LONG = 'long';
	K_NATIVE = 'native';
	K_NEW = 'new';
	K_NULL = 'null';
	K_PACKAGE = 'package';
	K_PUBLIC = 'public';
	K_PRIVATE = 'private';
	K_PROTECTED = 'protected';
	K_RETURN = 'return';
	K_SHORT = 'short';
	K_STATIC = 'static';
	K_SUPER = 'super';
	K_SWITCH = 'switch';
	K_SYNCHRONIZED = 'synchronized';
	K_THIS = 'this';
	K_THROW = 'throw';
	K_THROWS = 'throws';
	K_TRANSIENT = 'transient';
	K_TRUE = 'true';
	K_TRY = 'try';
	K_WHILE = 'while';
	K_VOLATILE = 'volatile';
	K_VOID = 'void';
}

@parser::header {
	package org.z.lexer;
}

@parser::members {
	private String activePackageName = null;
}

@lexer::header {
	package org.z.lexer;
}

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;
    
LONG
	:	'0'..'9'+ ('L' | 'l')
    ;
        
HEX_LONG
	:	'0' ('x' | 'X') HEX_DIGIT+ 'L'
    ;
        
HEX
	:	'0' ('x' | 'X') HEX_DIGIT+
    ;

FLOAT
    :	(('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT) ('F' | 'f')
    ;
    
DOUBLE
    :	('0'..'9')+ '.' ('0'..'9')* EXPONENT?
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

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
    ;

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
       
fullName returns [java.lang.String result]
	:	x=ID  {
			$result = x.getText();
		}
		(('.') => ('.' x=ID) {
			$result += "." + x.getText();
		})*
	;
	
importName returns [java.lang.String result]
	:	x=ID  {
			$result = x.getText();
		} 
		(
			'.' { $result += "."; }
			(
				(x=ID { $result += x.getText(); })
				|
				(x='*' { $result += x.getText(); })
			)
		)*
	;
    
run returns [org.z.lexer.grammar.File result]
	:	{
			$result = new org.z.lexer.grammar.File();
		}
		(
			(thePackageName=packageDefinition {
				$result.setPackageName(thePackageName.result);
				activePackageName = thePackageName.result;
			})
			|
			(theImportName=importDefinition {
				$result.addImport(theImportName.result);
			})
			|
			(intDef=interfaceDefinition {
				$result.addObject(intDef.result);
			})
			|
			(classDef=classDefinition {
				$result.addObject(classDef.result);
			})
			|
			(enumDef=enumDefinition {
				$result.addObject(enumDef.result);
			})
		)*
	;
	
packageDefinition returns [java.lang.String result]
	:	K_PACKAGE
		thePackageName=fullName {
			$result = thePackageName.result;
		}
		';'
	; 
		
importDefinition returns [java.lang.String result]
	:	K_IMPORT
		(
			((K_STATIC) => (K_STATIC importStatic=fullName {
				$result = importStatic.result;
			}))
			|
			theImportName=importName {
				$result = theImportName.result;
			}
		)
		';'
	;

enumDefinition returns [org.z.lexer.grammar.Enum result]
	:	{
			$result = new org.z.lexer.grammar.Enum();
		}
		(perm=permission {
				$result.setPermission(perm.result);
		})?
		(isStatic=K_STATIC {
			$result.setIsStatic(true);
		})?
		K_ENUM
		(theClassName=ID {
			if(activePackageName != null)
				$result.setName(activePackageName + "." + theClassName.getText());
			else
				$result.setName(theClassName.getText());
		})
		'{'
		(ev=enumValue {
			$result.addValue(ev.result);
		})?
		(
			','
			ev=enumValue {
				$result.addValue(ev.result);
			}
		)*
		';'?
		
		(
			// constructor
			(annotation* keyword* ID '(') => (m=method {
				$result.addMethod(m.result);
			})
			|
			// member variables
			(annotation* keywordNoType* type ID ('[' ']')* (',' | ';' | '=')) => (var=variableDefinitions {
				$result.addInstanceVariable(var.result);
			} ';')
			|
			// methods
			(annotation* keyword* type ID '(') => (m=method {
				$result.addMethod(m.result);
			})
			|
			// static block
			(K_STATIC stmts=block {
				$result.setStaticBlock(stmts.result);
			})
		)*
		
		'}'
	;
	
enumValue returns [org.z.lexer.grammar.EnumValue result]
	:	{
			$result = new org.z.lexer.grammar.EnumValue();
		}
		name=ID {
			$result.setName(name.getText());
		}
		('(' arguments=expressionList ')')? {
			if(arguments != null) {
				$result.setArguments(arguments.result);
			}
		}
	;
    
classDefinition returns [org.z.lexer.grammar.Class result]
	:	{
			$result = new org.z.lexer.grammar.Class();
		}
		(
			(perm=permission {
				$result.setPermission(perm.result);
			})
			|
			(K_FINAL {
				$result.setIsFinal(true);
			})
			|
			(K_STATIC {
				$result.setIsStatic(true);
			})
			|
			(K_ABSTRACT {
				$result.setIsAbstract(true);
			})
		)*
		K_CLASS
		(theClassName=ID {
			if(activePackageName != null)
				$result.setName(activePackageName + "." + theClassName.getText());
			else
				$result.setName(theClassName.getText());
		})
		(generic=genericDefinition {
			$result.setGeneric(generic.result); 
		})?
		(K_EXTENDS imp=type {
			$result.setExtension(imp.result); 
		})?
		(
			(K_IMPLEMENTS imp=type {
				$result.addImplementation(imp.result); 
			})
			(',' imp=type {
				$result.addImplementation(imp.result); 
			})*
		)?
		(body=classBody {
			$result.setBody(body.result);
		})
		';'?
	;
		
classBody returns [org.z.lexer.grammar.ClassBody result]
	:	{
			$result = new org.z.lexer.grammar.ClassBody();
		}
		'{'
		(
			(
				(keyword* K_ENUM) => (enumDef=enumDefinition {
					$result.addObject(enumDef.result);
				})
				|
				(keyword* K_INTERFACE) => (intDef=interfaceDefinition {
					$result.addObject(intDef.result);
				})
				|
				(keyword* K_CLASS ID) => (classDef=classDefinition {
					$result.addObject(classDef.result);
				})
				|
				(annotation* keyword* type ID '(') => (m=method {
					$result.addMethod(m.result);
				})
				|
				(annotation* keyword* genericDefinition? type ID genericDefinition? ('[' ']')* '(') => (m=method {
					$result.addMethod(m.result);
				})
				|
				(annotation* keywordNoType* type ID ('[' ']')* (',' | ';' | '=')) => (var=variableDefinitions {
					$result.addInstanceVariable(var.result);
				} ';')
				|
				(annotation* keyword* ID '(') => (m=method {
					$result.addMethod(m.result);
				})
				|
				(K_STATIC stmts=block {
					$result.setStaticBlock(stmts.result);
				})
			)
			';'?
		)*
		'}'
	;
		
permission returns [java.lang.String result]
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
	
genericDefinitionBase returns [org.z.lexer.grammar.Type result]
	:	{
			$result = new org.z.lexer.grammar.Type();
		}
		(
			((x1=keywordType | x2=fullName) g=genericDefinition? array=('[' ']')*) {
				if(x1 != null) {
					$result.setBase(x1.toString());
				}
				if(x2 != null) {
					$result.setBase(x2.toString());
				}
				
				if(g != null) {
					$result.setGeneric(g.result);
				}
				if(array != null) {
					$result.setDepth(array.getText().length() / 2);
				}
			}
			|
			(
				'?' {
					$result = new org.z.lexer.grammar.Type("?");
				}
			)
		)
		(
			K_EXTENDS
			ext=type {
				$result = new org.z.lexer.grammar.Type("? extends " + ext.result);
			}
			('&' ext2=type {
				$result.setBase($result.getBase() + " & " + ext2.result.toString());
			})*
		)?
		(K_SUPER sup=type {
			$result = new org.z.lexer.grammar.Type("? super " + sup.result);
		})?
	;
	
genericDefinition returns [org.z.lexer.grammar.Generic result]
	:	{
			$result = new org.z.lexer.grammar.Generic();
		}
		'<'
		(
			gb=genericDefinitionBase {
				$result.addType(gb.result);
			}
			(',' gb=genericDefinitionBase {
				$result.addType(gb.result);
			})*
		)?
		'>'
	;
	
baseType returns [org.z.lexer.grammar.Type result]
	:	(
			((keywordType) => primitive=keywordType {
				$result = new org.z.lexer.grammar.PrimitiveType(primitive.result);
			})
			|
			(base=fullName {
				$result = new org.z.lexer.grammar.Type();
				$result.setBase(base.result);
			})
		)
	;
			
typeWithAnnotation returns [org.z.lexer.grammar.Type result]
	:	{
			$result = new org.z.lexer.grammar.Type();
		}
		(anno=annotation {
			$result.addAnnotation(anno.result);
		})*
		t=type {
			ArrayList<org.z.lexer.grammar.Annotation> annotations = $result.getAnnotations();
			$result = t.result;
			$result.setAnnotations(annotations);
		}
	;
		
type returns [org.z.lexer.grammar.Type result]
	:	(base=baseType {
			$result = base.result;
		})
		(('<') => generic=genericDefinition {
			$result.setGeneric(generic.result); 
		})?
		(('[') => ('[' ']' {
			$result.setDepth($result.getDepth() + 1);
		}))*
	;
			
typeWithSize returns [org.z.lexer.grammar.TypeWithSize result]
	:	(base=baseType {
			$result = new org.z.lexer.grammar.TypeWithSize();
			$result.setBase(base.result.getBase());
		})
		(('<') => generic=genericDefinition {
			$result.setGeneric(generic.result); 
		})?
		(('[') => ('[' expr=expression? ']' {
			$result.setDepth($result.getDepth() + 1);
			if(expr != null)
				$result.addSize(expr.result);
			else
				$result.addSize(null);
		}))*
	;
		
keywordType returns [java.lang.String result]
	:	K_BOOLEAN { $result = "boolean"; }
	|	K_BYTE { $result = "byte"; }
	|	K_CHAR { $result = "char"; }
	|	K_DOUBLE { $result = "double"; }
	|	K_FLOAT { $result = "float"; }
	|	K_INT { $result = "int"; }
	|	K_LONG { $result = "long"; }
	|	K_SHORT { $result = "short"; }
	|	K_VOID { $result = "void"; }
	;
	
keywordNoType
	:	(
			K_ABSTRACT | K_ASSERT |
			K_BREAK |
			K_CASE | K_CATCH | K_CLASS | K_CONTINUE |
			K_DEFAULT | K_DO |
			K_ELSE | K_ENUM | K_EXTENDS |
			K_FALSE | K_FINAL | K_FINALLY |
			K_IF | K_IMPLEMENTS | K_IMPORT | K_INSTANCEOF | K_INTERFACE |
			K_FOR |
			K_NATIVE | K_NEW | K_NULL |
			K_PACKAGE | K_PUBLIC | K_PRIVATE | K_PROTECTED |
			K_RETURN |
			K_STATIC | K_SUPER | K_SWITCH | K_SYNCHRONIZED |
			K_THIS | K_THROW | K_THROWS | K_TRANSIENT | K_TRUE | K_TRY |
			K_WHILE |
			K_VOLATILE
		)
	;
	
keyword
	:	(
			K_ABSTRACT | K_ASSERT |
			K_BOOLEAN | K_BREAK | K_BYTE |
			K_CASE | K_CATCH | K_CHAR | K_CLASS | K_CONTINUE |
			K_DEFAULT | K_DO | K_DOUBLE |
			K_ELSE | K_ENUM | K_EXTENDS |
			K_FALSE | K_FINAL | K_FINALLY | K_FLOAT |
			K_IF | K_IMPLEMENTS | K_IMPORT | K_INSTANCEOF | K_INT | K_INTERFACE
			K_FOR |
			K_LONG |
			K_NATIVE | K_NEW | K_NULL |
			K_PACKAGE | K_PUBLIC | K_PRIVATE | K_PROTECTED |
			K_RETURN |
			K_SHORT | K_STATIC | K_SUPER | K_SWITCH | K_SYNCHRONIZED |
			K_THIS | K_THROW | K_THROWS | K_TRANSIENT | K_TRUE | K_TRY |
			K_WHILE |
			K_VOID | K_VOLATILE
		)
	;
	
method returns [org.z.lexer.grammar.Method result]
	:	{
			$result = new org.z.lexer.grammar.Method();
		}
		('@') => (anno=annotation {
			$result.addAnnotation(anno.result);
		})*
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
			|
			(K_ABSTRACT {
				$result.setIsAbstract(true);
			})
			|
			(staticGeneric=genericDefinition {
				$result.setStaticGeneric(staticGeneric.result);
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
		('[' ']' {
			$result.setReturnType($result.getReturnType().increaseDepth());
		})*
		(
			K_THROWS
			(
				(cn=fullName ','?) {
					$result.addThrows(cn.result);
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
		('.' '.' '.' {
			$result = new org.z.lexer.grammar.Varargs($result);
		})?
		name=ID {
			$result.setName(name.getText());
		}
		('[') => ('[' ']' {
			$result.getType().setDepth($result.getType().getDepth() + 1);
		})*
	;
	
statement returns [org.z.lexer.grammar.Statement result]
	:	(
			(stmt1=singleStatement {
				$result = stmt1.result;
			} ';'*)
			|
			(stmt2=complexStatement {
				$result = stmt2.result;
			})
			|
			('{') => (stmt3=block {
				$result = stmt3.result;
			})
		)
		
	;
	
complexStatement returns [org.z.lexer.grammar.ComplexStatement result]
	:	(stmt1=synchronizedStatement {
			$result = stmt1.result;
		})
		|
		(stmt2=ifStatement {
			$result = stmt2.result;
		})
		|
		(stmt3=exceptionStatement {
			$result = stmt3.result;
		})
		|
		(K_FOR '(' (singleStatement | ';') expression? ';' expressionList? ')') => (stmt4=forStatement {
			$result = stmt4.result;
		})
		|
		(K_FOR '(' type ID ':' expression ')') => (stmt5=foreachStatement {
			$result = stmt5.result;
		})
		|
		(stmt6=whileStatement {
			$result = stmt6.result;
		})
		|
		(stmt7=doStatement {
			$result = stmt7.result;
		})
		|
		(stmt8=classDefinition {
			$result = stmt8.result;
		})
		|
		(stmt9=switchStatement {
			$result = stmt9.result;
		})
	;
	
switchStatement returns [org.z.lexer.grammar.SwitchStatement result]
	:	{
			$result = new org.z.lexer.grammar.SwitchStatement();
		}
		K_SWITCH
		'(' condition=expression ')' {
			$result.setCondition(condition.result);
		}
		'{'
		(
			((K_CASE) => caseStmt=caseStatement {
				$result.addCase(caseStmt.result);
			})
			|
			((K_DEFAULT) => defaultStmt=defaultStatement {
				$result.setDefaultCase(defaultStmt.result);
			})
		)*
		'}'
	;
	
defaultStatement returns [org.z.lexer.grammar.DefaultStatement result]
	:	K_DEFAULT ':' {
			$result = new org.z.lexer.grammar.DefaultStatement();
		}
		(stmt=statement {
			$result.add(stmt.result);
		})*
	;
	
caseStatement returns [org.z.lexer.grammar.CaseStatement result]
	:	K_CASE caseExpr=expression ':' {
			$result = new org.z.lexer.grammar.CaseStatement();
			$result.setCondition(caseExpr.result);
		}
		(caseStmt=statement {
			$result.getBlock().add(caseStmt.result);
		})*
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
		(K_CATCH) => (catchStmt=catchBlock {
			$result.addCatchBlock(catchStmt.result);
		})*
		(K_FINALLY) => (finallyStmt=finallyBlock {
			$result.setFinallyBlock(finallyStmt.result);
		})?
	;
	
tryBlock returns [org.z.lexer.grammar.TryBlock result]
	:	{
			$result = new org.z.lexer.grammar.TryBlock();
		}
		K_TRY
		('(' var=variableDefinitions {
			$result.addVariable(var.result);
		} (';' var=variableDefinitions {
			$result.addVariable(var.result);
		})* ')')?
		tryStmt=block {
			$result.setBlock(tryStmt.result);
		}
	;
	
catchBlock returns [org.z.lexer.grammar.CatchBlock result]
	:	K_CATCH {
			$result = new org.z.lexer.grammar.CatchBlock();
		}
		'('
		(exClass=fullName '|'? {
			$result.addExceptionClass(exClass.result);
		})+
		exVar=ID
		')'
		catchStmt=block {
			$result.setExceptionVariable(exVar.getText());
			$result.setBlock(catchStmt.result);
		}
	;
	
finallyBlock returns [org.z.lexer.grammar.FinallyBlock result]
	:	K_FINALLY
		finallyStmt=block {
			$result = new org.z.lexer.grammar.FinallyBlock();
			$result.setBlock(finallyStmt.result);
		}
	;
		
foreachStatement returns [org.z.lexer.grammar.ForeachStatement result]
	:	(
			K_FOR '(' t=type var=ID ':' expr=expression ')'
			blk=singleOrBlock
		)
		{
			$result = new org.z.lexer.grammar.ForeachStatement();
			$result.setType(t.result);
			$result.setVar(var.getText());
			$result.setArray(expr.result);
			$result.setBlock(blk.result);
		}
	;
	
forStatement returns [org.z.lexer.grammar.ForStatement result]
	:	(
			K_FOR '(' (before=singleStatement | ';') condition=expression? ';' iterate=expressionList? ')'
			(blk=singleOrBlock | ';')
		)
		{
			$result = new org.z.lexer.grammar.ForStatement();
			if(before != null) {
				$result.setBefore(before.result);
			}
			if(condition != null) {
				$result.setCondition(condition.result);
			}
			if(iterate != null) {
				$result.setIterate(iterate.result);
			}
			if(blk != null) {
				$result.setBlock(blk.result);
			}
		}
	;
	
singleOrBlock returns [org.z.lexer.grammar.Block result]
	:	('{') => (theBlock=block {	
			$result = new org.z.lexer.grammar.Block();
			$result.setStatements(theBlock.result.getStatements());
		})
		|
		(singleStmt=statement {
			$result = new org.z.lexer.grammar.Block();
			$result.add(singleStmt.result);
		})
	;
	
ifStatement returns [org.z.lexer.grammar.IfStatement result]
	:	K_IF
		'('
		theExpression=expression {
			$result = new org.z.lexer.grammar.IfStatement();
			$result.setCondition(theExpression.result);
		}
		')'
		(
			(sob=singleOrBlock {
				$result.setBlock(sob.result);
			})
			|
			';'
		)
		(
			K_ELSE
			sob=singleOrBlock {
				$result.setElseBlock(sob.result);
			}
		)?
	;
		
whileStatement returns [org.z.lexer.grammar.WhileStatement result]
	:	K_WHILE
		'('
		theExpression=expression {
			$result = new org.z.lexer.grammar.WhileStatement();
			$result.setCondition(theExpression.result);
		}
		')'
		(
			(sob=singleOrBlock {
				$result.setBlock(sob.result);
			})
			|
			';'
		)
	;
	
variableDefinitionBase returns [org.z.lexer.grammar.VariableDefinitionBase result]
	:	varName=ID {
			$result = new org.z.lexer.grammar.VariableDefinitionBase();
			$result.setName(varName.getText());
		}
		('[') => ('[' ']' {
			$result.incrementAddDepth();
		})*
		(
			'='
			(
				(expr=expression {
					$result.setDefaultValue(expr.result);
				})
				|
				(array=arrayValues {
					$result.setDefaultValue(array.result);
				})
			)
		)?
	;
	
variableDefinitions returns [org.z.lexer.grammar.VariableDefinitions result]
	:	{
			$result = new org.z.lexer.grammar.VariableDefinitions();
		}
		('@') => (anno=annotation {
			$result.addAnnotation(anno.result);
		})*
		(
			(
				(thePermission=permission {
					$result.setPermission(thePermission.result);
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
				|
				(K_TRANSIENT {
					$result.setIsTransient(true);
				})
			)*
			varType=type {
				$result.setType(varType.result);
			}
			(varDef=variableDefinitionBase {
				$result.addVariable(varDef.result);
			})
			(',' varDef=variableDefinitionBase {
				$result.addVariable(varDef.result);
			})*
		)
	;
	
singleStatement returns [org.z.lexer.grammar.SimpleStatement result]
	:	(
			(ID ':') => (labelStmt=labelStatement {
				$result = labelStmt.result;
			})
			|
			(annotation* K_FINAL? type ID ('[' | '=' | ';' | ',')) => (variableDef=variableDefinitions {
				$result = variableDef.result; 
			} ';')
			|
			(simpleStmt=simpleStatement {
				$result = simpleStmt.result;
			} ';')
			|
			(returnStmt=returnStatement {
				$result = returnStmt.result;
			} ';')
			|
			(assertStmt=assertStatement {
				$result = assertStmt.result;
			} ';')
			|
			(continueStmt=continueStatement {
				$result = continueStmt.result;
			} ';')
			|
			(breakStmt=breakStatement {
				$result = breakStmt.result;
			} ';')
		)
	;

simpleStatement returns [org.z.lexer.grammar.SimpleStatement result]
	:	(expr2=expression {
			$result = new org.z.lexer.grammar.SimpleStatement();
			$result.setExpression(expr2.result);
		})
	;
	
newClassExpression returns [org.z.lexer.grammar.NewClassExpression result]
	:	(K_NEW t=type '(' args=expressionList? ')' body=classBody) {
			$result = new org.z.lexer.grammar.NewClassExpression();
			$result.setType(t.result);
			if(args != null)
				$result.setArguments(args.result);
			$result.setBody(body.result);
		}
	;
	
newObjectExpression returns [org.z.lexer.grammar.NewObjectExpression result]
	:	(
			(K_NEW t=typeWithSize) {
				$result = new org.z.lexer.grammar.NewObjectExpression();
				$result.setType(t.result);
			}
			(
				('(') => ('(' args=expressionList? {
					if(args != null)
						$result.setArguments(args.result);
				} ')')
				|
				('{') => (v=arrayValues {
					$result.setValue(v.result);
				})
			)?
		)
	;
			
newExpression returns [org.z.lexer.grammar.NewExpression result]
	:	((K_NEW type '(' expressionList? ')' '{') => new1=newClassExpression {
			$result = new1.result;
		})
		|
		((K_NEW typeWithSize) => new2=newObjectExpression {
			$result = new2.result;
		})
	;
		
throwExpression returns [org.z.lexer.grammar.ThrowExpression result]
	:	(K_THROW expr=expression) {
			$result = new org.z.lexer.grammar.ThrowExpression();
			$result.setExpression(expr.result);
		}
	;
		
assertStatement returns [org.z.lexer.grammar.AssertStatement result]
	:	(K_ASSERT expr=expression? (':' infoExpr=expression)?) {
			$result = new org.z.lexer.grammar.AssertStatement();
			if(expr != null) {
				$result.setExpression(expr.result);
			}
			if(infoExpr != null) {
				$result.setInformationExpression(infoExpr.result);
			}
		}
	;
	
returnStatement returns [org.z.lexer.grammar.ReturnStatement result]
	:	(K_RETURN expr=expression?) {
			$result = new org.z.lexer.grammar.ReturnStatement();
			if(expr != null) {
				$result.setExpression(expr.result);
			}
		}
	;
	
expressionKeyword returns [org.z.lexer.grammar.Expression result]
	:	(K_NULL {
			$result = new org.z.lexer.grammar.NullExpression();
		})
		|
		(K_TRUE {
			$result = new org.z.lexer.grammar.Value(new Boolean(true));
		})
		|
		(K_FALSE {
			$result = new org.z.lexer.grammar.Value(new Boolean(false));
		})
	;

expression returns [org.z.lexer.grammar.Expression result]
	:	(exprKeyword=expressionKeyword {
			$result = exprKeyword.result;
		})
		|
		(throwExpr=throwExpression {
			$result = throwExpr.result;
		})
		|
		(expr=assignmentExpression {
			$result = expr.result;
		})
	;

assignmentOperator returns [java.lang.String result]
	:	('+' '=') => ('+' '=' {
			$result = "+=";
		})
		|
		('-' '=') => ('-' '=' {
			$result = "-=";
		})
		|
		('*' '=') => ('*' '=' {
			$result = "*=";
		})
		|
		('/' '=') => ('/' '=' {
			$result = "/=";
		})
		|
		('%' '=') => ('%' '=' {
			$result = "\%=";
		})
		|
		('<' '<' '<' '=') => ('<' '<' '<' '=' {
			$result = "<<<=";
		})
		|
		('>' '>' '>' '=') => ('>' '>' '>' '=' {
			$result = ">>>=";
		})
		|
		('<' '<' '=') => ('<' '<' '=' {
			$result = "<<=";
		})
		|
		('>' '>' '=') => ('>' '>' '=' {
			$result = ">>=";
		})
		|
		('&' '=') => ('&' '=' {
			$result = "&=";
		})
		|
		('^' '=') => ('^' '=' {
			$result = "^=";
		})
		|
		('|' '=') => ('|' '=' {
			$result = "/=";
		})
		|
		('=' {
			$result = "=";
		})
	;

assignmentExpression returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr1=ternaryConditional {
			$result = new org.z.lexer.grammar.AssignmentExpression();
			$result.setLeft(expr1.result);
		})
		((assignmentOperator expression) => (
			op=assignmentOperator expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right(op.result, expr2.result));
			}
		))*
	;
	
ternaryConditional returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr=logicalOr {
			$result = expr.result;
		})
		(('?' expression ':' expression) => (
			'?' expr2=expression ':' expr3=expression {
				$result = new org.z.lexer.grammar.TernaryExpression($result);
				$result.addRight(new org.z.lexer.grammar.Right("?", expr2.result));
				$result.addRight(new org.z.lexer.grammar.Right(":", expr3.result));
			}
		))*
	;
	
logicalOr returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr1=logicalAnd {
			$result = new org.z.lexer.grammar.LogicalOrExpression();
			$result.setLeft(expr1.result);
		})
		(('|' '|' expression) => (
			'|' '|' expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right("||", expr2.result));
			}
		))*
	;
	
logicalAnd returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr1=bitwiseOr {
			$result = new org.z.lexer.grammar.LogicalAndExpression();
			$result.setLeft(expr1.result); 
		})
		(('&' '&' expression) => (
			'&' '&' expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right("&&", expr2.result));
			}
		))*
	;
	
bitwiseOr returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr=bitwiseXor {
			$result = expr.result;
		})
		(('|' expression) => (
			'|' expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right("|", expr2.result));
			}
		))*
	;
	
bitwiseXor returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr=bitwiseAnd {
			$result = expr.result;
		})
		(('^' expression) => (
			'^' expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right("^", expr2.result));
			}
		))*
	;
		
bitwiseAnd returns [org.z.lexer.grammar.BinaryExpression result]
	:	(expr=equalityExpression {
			$result = expr.result;
		})
		(('&' expression) => (
			'&' expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right("&", expr2.result));
			}
		))*
	;
		
equalityOperator returns [java.lang.String result]
	:	('!' '=') => (('!' '=') {
			$result = "!=";
		})
		|
		('=' '=') => (('=' '=') {
			$result = "==";
		})
	;
	
equalityExpression returns [org.z.lexer.grammar.BinaryExpression result]
	:	expr1=comparisonExpression {
			$result = new org.z.lexer.grammar.EqualityExpression();
			$result.setLeft(expr1.result);
		}
		((equalityOperator expression) => (
			op=equalityOperator expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right(op.result, expr2.result));
			}
		))*
	;
			
comparisonOperator returns [java.lang.String result]
	:	('>' '=') => (('>' '=') {
			$result = ">=";
		})
		|
		('<' '=') => (('<' '=') {
			$result = "<=";
		})
		|
		('>') => ('>' {
			$result = ">";
		})
		|
		('<') => ('<' {
			$result = "<";
		})
		|
		(K_INSTANCEOF) => (K_INSTANCEOF {
			$result = "INSTANCEOF";
		})
	;
	
comparisonExpression returns [org.z.lexer.grammar.BinaryExpression result]
	:	expr1=bitwiseExpression {
			$result = new org.z.lexer.grammar.ComparisonExpression();
			$result.setLeft(expr1.result);
		}
		((comparisonOperator expression) => (
			op=comparisonOperator expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right(op.result, expr2.result));
			}
		))*
	; 
				
bitwiseOperator returns [java.lang.String result]
	:	(
			('>' '>' {
				$result = ">>";
			})
			|
			('<' '<' {
				$result = "<<";
			})
			|
			('<' '<' '<' {
				$result = "<<<";
			})
			|
			('>' '>' '>' {
				$result = ">>>";
			})
		)
	;
	
bitwiseExpression returns [org.z.lexer.grammar.BinaryExpression result]
	:	expr=additionExpression {
			$result = expr.result;
		}
		((bitwiseOperator expression) => (
			op=bitwiseOperator expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right(op.result, expr2.result));
			}
		))*
	;
		
additionOperator returns [java.lang.String result]
	:	('+' {
			$result = "+";
		})
		|
		('-' {
			$result = "-";
		})
	;

additionExpression returns [org.z.lexer.grammar.BinaryExpression result]
	:	expr1=multiplyExpression {
			$result = new org.z.lexer.grammar.AdditionExpression();
			$result.setLeft(expr1.result);
		}
		((additionOperator expression) => (
			op=additionOperator expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right(op.result, expr2.result));
			}
		))*
	;
			
multiplyOperator returns [java.lang.String result]
	:	('*' {
			$result = "*";
		})
		|
		('/' {
			$result = "/";
		})
		|
		('%' {
			$result = "\%";
		})
	;
	
multiplyExpression returns [org.z.lexer.grammar.BinaryExpression result]
	:	expr=objectAccess {
			$result = expr.result;
		}
		((multiplyOperator expression) => (
			op=multiplyOperator expr2=expression {
				$result.addRight(new org.z.lexer.grammar.Right(op.result, expr2.result));
			}
		))*
	;
			
objectAccess returns [org.z.lexer.grammar.BinaryExpression result]
	:	{
			$result = new org.z.lexer.grammar.ObjectAccess();
		}
		left=functionCall {
			$result.setLeft(left.result);
		}
		(('.') => ('.'
			(gen=genericDefinition {
				
			})?
			(
				K_CLASS {
					$result.addRight(new org.z.lexer.grammar.Right(".", new org.z.lexer.grammar.Identifier("class")));
				}
				|
				right=functionCall {
					$result.addRight(new org.z.lexer.grammar.Right(".", right.result));
				})
			)
		)*
	;
		
functionCall returns [org.z.lexer.grammar.Expression result]
	:	expr=unaryExpression {
			$result = new org.z.lexer.grammar.FunctionCall();
			((org.z.lexer.grammar.FunctionCall) $result).setExpression(expr.result);
		}
		('('
			(args=expressionList {
				((org.z.lexer.grammar.FunctionCall) $result).setArguments(args.result);
			})?
			')'
		)?
		(aa=arrayAccess {
			if(!($result instanceof org.z.lexer.grammar.ArrayAccess)) {
				$result = new org.z.lexer.grammar.ArrayAccess($result);
			}
			((org.z.lexer.grammar.ArrayAccess) $result).addRight(new org.z.lexer.grammar.Right("[]", aa.result));
		})*
	;
	
postUnaryOperator returns [java.lang.String result]
	:	('+' '+') => ('+' '+' {
			$result = "++";
		})
		|
		('-' '-') => ('-' '-' {
			$result = "--";
		})
	;
	
preUnaryOperator returns [java.lang.String result]
	:	(post=postUnaryOperator {
			$result = post.result;
		})
		|
		('-' {
			$result = "-"; 
		})
		|
		('+' {
			$result = "+"; 
		})
		|
		('!' {
			$result = "!"; 
		})
		|
		('~' {
			$result = "~";
		})
	;
	
unaryExpression returns [org.z.lexer.grammar.Expression result]
	:	((preUnaryOperator? '(' type ')' expression) => pre=preUnaryOperator? ce=castExpression {
			$result = ce.result;
			if(pre != null) {
				$result = new org.z.lexer.grammar.UnaryExpression($result, pre.result, true);
			}
		})
		|
		(
			(
				pre=preUnaryOperator?
				expr=single
				(
					(('-' | '+') '='? expression) => ((op1=assignmentOperator | op2=additionOperator) expr2=expression)
					|
					post=postUnaryOperator?
				)
			)
			{
				$result = expr.result;
				if(pre != null) {
					$result = new org.z.lexer.grammar.UnaryExpression($result, pre.result, true);
				}
				if(expr2 != null) {
					$result = new org.z.lexer.grammar.AdditionExpression($result, ((op1 != null) ? op1.result : op2.result), expr2.result);
				}
				if(post != null) {
					$result = new org.z.lexer.grammar.UnaryExpression($result, post.result, false);
				}
			}
		)
	;
	
castExpression returns [org.z.lexer.grammar.CastExpression result]
	:	(('(' t=type ')' expr=expression) {
			$result = new org.z.lexer.grammar.CastExpression();
			$result.setType(t.result);
			$result.setExpression(expr.result);
		})
	;
	
single returns [org.z.lexer.grammar.Expression result]
	:	(
			(v=value {
				$result = v.result;
			})
			|
			(v2=groupOperator {
				$result = v2.result;
			})
		)
		(aa=arrayAccess {
			if(!($result instanceof org.z.lexer.grammar.ArrayAccess)) {
				$result = new org.z.lexer.grammar.ArrayAccess($result);
			}
			((org.z.lexer.grammar.ArrayAccess) $result).addRight(new org.z.lexer.grammar.Right("[]", aa.result));
		})*
	;
	
arrayAccess returns [org.z.lexer.grammar.Expression result]
	:	'['
		expr=expression {
			$result = expr.result;
		}
		']'
	;

value returns [org.z.lexer.grammar.Expression result]
	:	{
			$result = new org.z.lexer.grammar.Value();
		}
		(
		(type) => (kw=type {
			$result = new org.z.lexer.grammar.KeywordExpression(kw.result.toString());
		})
	|	K_THIS {
			$result = new org.z.lexer.grammar.ThisExpression();
		}
	|	K_SUPER {
			$result = new org.z.lexer.grammar.SuperExpression();
					}
	|	x1=INT {
			((org.z.lexer.grammar.Value) $result).setValue(Integer.valueOf(x1.getText()));
		}
	|	x2=FLOAT {
			String x2raw = x2.getText();
			((org.z.lexer.grammar.Value) $result).setValue(Float.valueOf(x2raw.substring(0, x2raw.length() - 1)));
		}
	|	x3=STRING {
			((org.z.lexer.grammar.Value) $result).setValue(x3.getText());
		}
	|	x4=CHAR {
			((org.z.lexer.grammar.Value) $result).setValue(new Character(x4.getText().charAt(0)));
		}
	|	x5=ID {
			((org.z.lexer.grammar.Value) $result).setValue(new org.z.lexer.grammar.Identifier(x5.getText()));
		}
	|	x6=HEX {
			((org.z.lexer.grammar.Value) $result).setValue(new java.math.BigInteger(x6.getText().substring(2), 16).intValue());
		}
	|	x7=LONG {
			String x7raw = x7.getText();
			((org.z.lexer.grammar.Value) $result).setValue(Long.valueOf(x7raw.substring(0, x7raw.length() - 1)));
		}
	|	x8=DOUBLE {
			((org.z.lexer.grammar.Value) $result).setValue(Double.valueOf(x8.getText()));
		}
	|	x9=HEX_LONG {
			String x9s = x9.getText().substring(2);
			((org.z.lexer.grammar.Value) $result).setValue(new java.math.BigInteger(x9s.substring(0, x9s.length() - 1), 16).longValue());
		}
	|	newExpr=newExpression {
			$result = newExpr.result;
		}
		)
	;
	
arrayValues returns [org.z.lexer.grammar.ArrayValue result]
	:	'{'
		(list=expressionList {
			$result = new org.z.lexer.grammar.ArrayValue();
			for(org.z.lexer.grammar.Expression e : list.result)
				$result.addValue(e);
		})?
		','?
		'}'
	;
	
groupOperator returns [org.z.lexer.grammar.Expression result]
	:	(('(' expr=expression ')') {
			org.z.lexer.grammar.GroupOperator go = new org.z.lexer.grammar.GroupOperator();
			go.setExpression(expr.result);
			$result = go;
		})
	;

expressionList returns [org.z.lexer.grammar.ExpressionList result]
	:	(expr=expression {
			$result = new org.z.lexer.grammar.ExpressionList();
			$result.add(expr.result);
		})
		((',') => (',' expr=expression) {
			$result.add(expr.result);
		})*
	;

annotation returns [org.z.lexer.grammar.Annotation result]
	:	'@' fn=fullName {
			$result = new org.z.lexer.grammar.Annotation();
			$result.setName(fn.result);
		}
		('(' (key=ID '=')? val=value {
			if(key == null) {
				$result.addKeyValue(new org.z.lexer.grammar.AnnotationKeyValue("value", val.result));
			}
			else {
				$result.addKeyValue(new org.z.lexer.grammar.AnnotationKeyValue(key.getText(), val.result));
			}
		} ')')*
	;

labelStatement returns [org.z.lexer.grammar.LabelStatement result]
	:	name=ID ':' {
			$result = new org.z.lexer.grammar.LabelStatement(name.getText());
		}
	;
	
continueStatement returns [org.z.lexer.grammar.ContinueStatement result]
	:	K_CONTINUE location=ID? {
			$result = new org.z.lexer.grammar.ContinueStatement();
			if(location != null)
				$result.setLocation(location.getText());
		}
	;
		
breakStatement returns [org.z.lexer.grammar.BreakStatement result]
	:	K_BREAK location=ID? {
			$result = new org.z.lexer.grammar.BreakStatement();
			if(location != null)
				$result.setLocation(location.getText());
		}
	;
    
interfaceDefinition returns [org.z.lexer.grammar.Interface result]
	:	{
			$result = new org.z.lexer.grammar.Interface();
		}
		(
			(perm=permission {
				$result.setPermission(perm.result);
			})
		)*
		(isStatic=K_STATIC {
			$result.setIsStatic(true);
		})?
		K_INTERFACE
		(theInterfaceName=ID {
			if(activePackageName != null) {
				$result.setName(activePackageName + "." + theInterfaceName.getText());
			}
			else {
				$result.setName(theInterfaceName.getText());
			}
		})
		(generic=genericDefinition {
			$result.setGeneric(generic.result); 
		})?
		(
			K_EXTENDS
			(imp=type ','? {
				$result.addExtension(imp.result); 
			})*
		)?
		(body=classBody {
			$result.setBody(body.result);
		})
		';'?
	;
			
doStatement returns [org.z.lexer.grammar.DoStatement result]
	:	K_DO
		blk=block {
			$result = new org.z.lexer.grammar.DoStatement();
			$result.setBlock(blk.result);
		}
		K_WHILE
		'('
		theExpression=expression {
			$result.setCondition(theExpression.result);
		}
		')' ';'
	;
