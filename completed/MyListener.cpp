// Generated from tinyrexx.g4 by ANTLR 4.7
#include <iostream>
#include "MyListener.h"

using namespace std;

MyListener::MyListener(const std::set<std::string> &ids) {
  vars = ids;
}


void MyListener::enterProgram(tinyrexxParser::ProgramContext *ctx) {
    cout << "#include <iostream>" << endl << endl
         << "using namespace std;" << endl << endl
         << "int main() {" << endl;
    indent += 4;
    // Dichiara le variabili
    for (auto name : vars) {
        cout << string(indent, ' ') << "int " << name << " = 0;" << endl;
    }

}

void MyListener::exitProgram(tinyrexxParser::ProgramContext *ctx) {
    cout << "}" << endl;
}

void MyListener::enterAssign(tinyrexxParser::AssignContext * ctx) {
    string name = ctx->ID()->getText();
    cout << string(indent, ' ') << name << " = " ;
}

void MyListener::exitAssign(tinyrexxParser::AssignContext * ctx) {
    cout << ";" << endl;
}

void MyListener::enterPrint(tinyrexxParser::PrintContext * ctx) {
    cout << string(indent, ' ') << "cout << " ;
}

void MyListener::exitPrint(tinyrexxParser::PrintContext * ctx) {
    cout << " << endl;" << endl;
}


void MyListener::exitInput(tinyrexxParser::InputContext * ctx) {
    string name = ctx->ID()->getText();
    cout << string(indent, ' ') << "cin >> " << name << ";" << endl;
}


void MyListener::enterA_expr(tinyrexxParser::A_exprContext * ctx) {
    // controllo in quale caso sono
    if(ctx->ID() != NULL) {
        // caso ID semplice
        cout << ctx->ID()->getText();
    } else if(ctx->NUMBER() != NULL) {
        // caso valore numerico semplice
        cout << ctx->NUMBER()->getText();
    } else if(ctx->MINUS() !=  NULL) {
        // caso operatore - unario
        cout << "-" ;
    } else if(ctx->a_op() != NULL) {
        // caso operatore binario: gestito da enterA_op
    } else {
        // caso parentesi
        cout << "(" ;
    }
}

void MyListener::exitA_expr(tinyrexxParser::A_exprContext * ctx) {
    // controllo in quale caso sono
    if(ctx->ID() != NULL) {
        // caso ID semplice
    } else if(ctx->NUMBER() != NULL) {
        // caso valore numerico semplice
    } else if(ctx->MINUS() !=  NULL) {
        // caso operatore - unario
    } else if(ctx->a_op() != NULL) {
        // caso operatore binario: gestito da exitA_op
    } else {
        // caso parentesi
        cout << ")" ;
    }
}

void MyListener::exitA_op(tinyrexxParser::A_opContext * ctx) {
    // controllo operatore aritmetico
    if(ctx->PLUS() != NULL) {
        cout << " + ";
    } else if(ctx->MINUS() != NULL) {
        cout << " - ";
    } else if(ctx->MUL() != NULL) {
        cout << " * ";
    } else if(ctx->DIV() != NULL) {
        cout << " / ";
    }
}

void MyListener::exitR_op(tinyrexxParser::R_opContext * ctx) {
    // controllo operatore aritmetico
    if(ctx->EQUAL() != NULL) {
        cout << " == ";
    } else if(ctx->LT() != NULL) {
        cout << " < ";
    } else if(ctx->LEQ() != NULL) {
        cout << " <= ";
    } else if(ctx->GT() != NULL) {
        cout << " > ";
    } else if(ctx->GEQ() != NULL) {
        cout << " >= ";
    }
}


void MyListener::enterW_loop(tinyrexxParser::W_loopContext * ctx){
    cout << string(indent, ' ') << "while";
    indent += 4;
}


void MyListener::exitW_loop(tinyrexxParser::W_loopContext * ctx){
    indent -= 4;
    cout << string(indent, ' ') << "}" << endl;
}

void MyListener::enterF_loop(tinyrexxParser::F_loopContext * ctx){
    cout << string(indent, ' ')<< "for";
    indent += 4;
}

void MyListener::exitF_loop(tinyrexxParser::F_loopContext * ctx){
    indent -= 4;
    cout << string(indent, ' ')<< "}" <<endl;
}


void MyListener::enterIf_proxy(tinyrexxParser::If_proxyContext * ctx){
    cout << "(";
}

void MyListener::exitIf_proxy(tinyrexxParser::If_proxyContext * ctx){
    cout << "){" << endl;
}

void MyListener::enterFor_proxy(tinyrexxParser::For_proxyContext * ctx){
  cout << "(";
  if(ctx->ID()!=NULL)
    cout << ctx->ID()->getText() << "=" ;
}

void MyListener::exitFor_proxy(tinyrexxParser::For_proxyContext * ctx){
  if(ctx->ID()!= NULL)
      cout <<">="<<ctx->ID()->getText()<< "; " << ctx->ID()->getText() << "++";
  cout << "){" << endl;
}
void MyListener::enterTerminate(tinyrexxParser::TerminateContext* ctx){
  cout << string(indent, ' ')<<"return ";
}

void MyListener::exitTerminate(tinyrexxParser::TerminateContext* ctx){
  cout <<";"<<'\n';
}

void MyListener::enterI_op(tinyrexxParser:: I_opContext* ctx){
    cout << string(indent, ' ')<< "if ";
    indent +=4;
}
void MyListener::exitI_op(tinyrexxParser:: I_opContext* ctx){
    indent -=4;
    cout<<string(indent, ' ')<<"} "<<'\n';
}
void MyListener::enterBool_OP(tinyrexxParser::Bool_OPContext* ctx){
    if(ctx->OPENP()!=NULL)
      cout<<"(";
}
void MyListener::exitBool_OP(tinyrexxParser::Bool_OPContext* ctx){
    if(ctx->CLOSEP()!=NULL)
      cout<< ")";
}

void MyListener::exitL_else(tinyrexxParser::L_elseContext* ctx){
  indent -=4;
  cout<<string(indent, ' ')<<"} else { "<<'\n';
  indent +=4;
}

void MyListener::exitB_op(tinyrexxParser::B_opContext* ctx){
  if(ctx->AND()!=NULL)
    cout << " && ";
  else if(ctx->OR()!=NULL)
    cout << " || ";
}

void MyListener::exitB_not(tinyrexxParser::B_notContext* ctx){
  cout << "!";
}

void MyListener::exitTo_r(tinyrexxParser::To_rContext* ctx){
  cout<<"; ";
}
