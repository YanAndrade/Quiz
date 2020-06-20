package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Transaction;
import web.DbListener;
import db.User;
import java.util.ArrayList;
import web.DbListener;
import db.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

if(request.getParameter("generateTransactionData")!=null){
    Transaction.generateSampleData();
    response.sendRedirect(request.getRequestURI());
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index - FINANCY$</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String errorMessage = null;
if(request.getParameter("session.login") != null){
    String login = request.getParameter("user.login");
    String password = request.getParameter("user.password");
    try{
        User user = User.getUser(login, password);
        if(user == null){
            errorMessage = "Login/password incorrect";
        }else{
            session.setAttribute("user.login", login);
            session.setAttribute("user.name", user.getName());
            session.setAttribute("user.role", user.getRole());
            response.sendRedirect(request.getRequestURI());
        }
    }catch(Exception ex){
        errorMessage = ex.getMessage();
    }
}else if(request.getParameter("session.logout") != null){
    session.removeAttribute("user.login");
    session.removeAttribute("user.name");
    session.removeAttribute("user.role");
    response.sendRedirect(request.getRequestURI());
}

      out.write("\n");
      out.write("<h1>FINANCY$</h1>\n");
if(session.getAttribute("user.login") == null){
      out.write("\n");
      out.write("    <form method=\"post\">\n");
      out.write("        Usuário: <input type=\"text\" name=\"user.login\" />\n");
      out.write("        Password: <input type=\"password\" name=\"user.password\" />\n");
      out.write("        <input type=\"submit\" name=\"session.login\" value=\"LogIn &#9660;\"/>\n");
      out.write("    </form>\n");
      out.write("    ");
if(errorMessage != null){
      out.write("\n");
      out.write("    <div style=\"color:red\">");
      out.print( errorMessage );
      out.write("</div>\n");
      out.write("    ");
}
      out.write('\n');
}else{
      out.write("\n");
      out.write("    <form>\n");
      out.write("        <a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">&#127968;INÍCIO</a> &#10072;\n");
      out.write("        <a href=\"");
      out.print(request.getContextPath());
      out.write("/categories.jsp\">CATEGORIAS</a> &#10072;\n");
      out.write("        <a href=\"");
      out.print(request.getContextPath());
      out.write("/transactions.jsp\">TRANSAÇÕES</a> &#10072;\n");
      out.write("        <a href=\"");
      out.print(request.getContextPath());
      out.write("/monthly_report.jsp\">RELATÓRIO MENSAL</a>\n");
      out.write("        ");
if(session.getAttribute("user.role").equals("ADMIN")){
      out.write("\n");
      out.write("        <span style=\"border:1px; background-color: lightgray; color:white;\">\n");
      out.write("            &nbsp; &#10074; &#x1F512;<a href=\"");
      out.print(request.getContextPath());
      out.write("/restricted/users.jsp\">USUÁRIOS</a>&#10074; &nbsp;\n");
      out.write("        </span>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("         &#10038;&#10148; Bem vindo, <u><a href=\"");
      out.print(request.getContextPath());
      out.write("/me.jsp\">");
      out.print( session.getAttribute("user.name") );
      out.write("</a></u>\n");
      out.write("        <input type=\"submit\" name=\"session.logout\" value=\"LogOut &#9650;\" />\n");
      out.write("    </form>\n");
}
      out.write('\n');
if(DbListener.exceptionMessage != null){
      out.write("\n");
      out.write("    <h3 style=\"color:red\">");
      out.print( DbListener.exceptionMessage );
      out.write("</h3>\n");
}
      out.write("\n");
      out.write("<hr/>");
      out.write("\n");
      out.write("        <h2>Index</h2>\n");
      out.write("        <div>\n");
      out.write("            <p>\n");
      out.write("                Bem vindo ao <b><u>FINANCY$</u></b>, sistema de gerenciamento de finanças pessoais.\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Há um cadastro de categorias pre-estabelecido em que você pode incluir ou remover conforme sua conveniência, e um cadastro de transçações financeira spara registrarar suas receitas e depsesas. \n");
      out.write("                Uma página mostrará um relatório consolidado para acompanhamento das suas finanças.\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Você pode clicar no botão abaixo para gerar uma amostra de transações financeiras fictícias.\n");
      out.write("                <form>\n");
      out.write("                    <input type=\"submit\" name=\"generateTransactionData\" value=\"Gerar Amostra de Transações\"/>\n");
      out.write("                </form>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
