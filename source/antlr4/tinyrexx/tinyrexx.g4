grammar tinyrexx;

program   : statement+;

statement : assign | print | input | w_loop | i_op | f_loop | terminate;

assign    : ID '=' a_expr  | ID '=' bool_OP;
print     : 'say' a_expr ;
input     : 'pull' ID ;
i_op      : 'if' bool_OP 'then' 'do' statement+ 'end' | 'if' bool_OP 'then' 'do' statement+ 'end''else' 'do' statement+ 'end';
w_loop    : 'do' 'while' bool_OP statement+ 'end' ;
f_loop    : 'do' ID '=' a_expr 'to' a_expr statement+ 'end';
test      : a_expr r_op a_expr;
a_expr    : ID | NUMBER | '(' a_expr ')' | a_expr a_op a_expr | MINUS a_expr ;
a_op      : MINUS | PLUS | MUL | DIV ;
r_op      : EQUAL | LT | LEQ | GT | GEQ ;
terminate : 'exit' a_expr;
bool_OP   : OPENP bool_OP CLOSEP | bool_OP AND bool_OP |bool_OP OR bool_OP | NOT bool_OP | test |a_expr;

OPENP     : '(' ;
CLOSEP    : ')' ;
MINUS     : '-' ;
PLUS      : '+' ;
MUL       : '*' ;
DIV       : '/' ;
EQUAL     : '==' ;
LT        : '<' ;
LEQ       : '<=' ;
GT        : '>' ;
GEQ       : '>=' ;
AND       : '&' ;
OR        : '|'  ;
NOT       : '\\'   ;
ID        : [a-z]+ ;
NUMBER    : [0-9]+ ;
WS        : [ \n\t]+ -> skip;
ErrorChar : . ;
