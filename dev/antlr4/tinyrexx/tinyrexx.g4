grammar tinyrexx;

program   : statement+;

statement : assign | print | input | w_loop | i_op | f_loop | terminate;

assign    : ID '=' a_expr;
print     : 'say' a_expr ;
input     : 'pull' ID ;
i_op      : 'if' if_proxy 'then' 'do' statement+ 'end' | 'if' if_proxy 'then' 'do' statement+ 'end' l_else 'do' statement+ 'end';
w_loop    : 'do' 'while' if_proxy statement+ 'end' ;
f_loop    : 'do' for_proxy statement+ 'end';
l_else    : 'else';
if_proxy  : bool_OP ;
for_proxy : ID '=' a_expr to_r a_expr;
to_r      : 'to';
a_expr    : ID | NUMBER | '(' a_expr ')' | a_expr a_op a_expr | MINUS a_expr ;
a_op      : MINUS | PLUS | MUL | DIV ;
r_op      : EQUAL | LT | LEQ | GT | GEQ ;
terminate : 'exit' a_expr;
bool_OP   : OPENP bool_OP CLOSEP | bool_OP b_op bool_OP | b_not bool_OP | a_expr r_op a_expr |a_expr;
b_op      : AND | OR;
b_not     : NOT ;

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
