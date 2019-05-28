#pragma once

#include "antlr4-runtime.h"
#include "tinyrexxParser.h"
#include "tinyrexxBaseListener.h"

/**
 * This class defines a concrete listener for a parse tree produced by tinyrexxParser.
 */
class  MyListener : public tinyrexxBaseListener {
private:
  int indent = 0;
  std::set<std::string> vars;

public:
  MyListener(const std::set<std::string> &ids);

  void enterProgram(tinyrexxParser::ProgramContext * ctx);
  void exitProgram(tinyrexxParser::ProgramContext * ctx);

  void enterAssign(tinyrexxParser::AssignContext * ctx);
  void exitAssign(tinyrexxParser::AssignContext * ctx);

  void enterPrint(tinyrexxParser::PrintContext * ctx);
  void exitPrint(tinyrexxParser::PrintContext * ctx);

  void exitInput(tinyrexxParser::InputContext * ctx);

  void enterW_loop(tinyrexxParser::W_loopContext * ctx);
  void exitW_loop(tinyrexxParser::W_loopContext * ctx);

  void enterF_loop(tinyrexxParser::F_loopContext * ctx);
  void exitF_loop(tinyrexxParser::F_loopContext * ctx);

  void enterIf_proxy(tinyrexxParser::If_proxyContext * ctx);
  void exitIf_proxy(tinyrexxParser::If_proxyContext * ctx);

  void enterFor_proxy(tinyrexxParser::For_proxyContext * ctx);
  void exitFor_proxy(tinyrexxParser::For_proxyContext * ctx);

  void enterA_expr(tinyrexxParser::A_exprContext * ctx);
  void exitA_expr(tinyrexxParser::A_exprContext * ctx);

  void exitA_op(tinyrexxParser::A_opContext * ctx);
  void exitR_op(tinyrexxParser::R_opContext * ctx);

  void enterTerminate(tinyrexxParser::TerminateContext * ctx);
  void exitTerminate(tinyrexxParser::TerminateContext * ctx);

  void enterI_op(tinyrexxParser::I_opContext* ctx);
  void exitI_op(tinyrexxParser::I_opContext* ctx);

  void enterBool_OP(tinyrexxParser::Bool_OPContext * ctx);
  void exitBool_OP(tinyrexxParser::Bool_OPContext * ctx);

  void exitL_else(tinyrexxParser::L_elseContext * ctx);

  void exitB_op(tinyrexxParser::B_opContext* ctx);

  void exitB_not(tinyrexxParser::B_notContext* ctx);

  void exitTo_r(tinyrexxParser::To_rContext* ctx);
};
