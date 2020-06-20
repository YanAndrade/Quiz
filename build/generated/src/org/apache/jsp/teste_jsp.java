package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.randomquiz.model.Ranking;
import br.com.fatecpg.randomquiz.model.User;
import java.util.ArrayList;
import br.com.fatecpg.randomquiz.model.Database;
import br.com.fatecpg.randomquiz.model.Question;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    String usuario = "";
    if (session.getAttribute("usuarioLogado") == null) {
        response.sendRedirect("login.jsp");
    } else {
        usuario = session.getAttribute("usuarioLogado").toString();
    }

    if (request.getParameter("btnFinalizaTeste") != null) {
        int total = 0;

        for (Question q : Database.getQuiz()) {
            String resposta = request.getParameter(q.getQuestion());
            if (resposta != null && resposta.equals(q.getAnswer())) {
                total++;
            }
        }

        double med = 10.0 * (total / (double) (Database.getQuiz().size()));
        Database.getRanking().add(new Ranking(usuario, med, 7));
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Teste</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>prova</h1>\n");
      out.write("        <h2>Teste</h2>\n");
      out.write("\n");
      out.write("        <form action=\"teste.jsp\">\n");
      out.write("            ");
ArrayList<Question> test = Database.getQuiz(); 
      out.write("\n");
      out.write("            ");
 for (Question question : test) {
      out.write("\n");
      out.write("            <h2>");
      out.print(question.getQuestion());
      out.write("</h2>\n");
      out.write("\n");
      out.write("            ");
for (String alternative : question.getAlternatives()) {
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-control\">\n");
      out.write("                <label class=\"radio\">\n");
      out.write("                    ");
String i = String.valueOf(test.indexOf(question));
      out.write("\n");
      out.write("                    <input type=\"radio\" name=\"");
      out.print(i);
      out.write("\" value=\"");
      out.print(alternative);
      out.write("\" required/>\n");
      out.write("                    ");
      out.print(alternative);
      out.write("\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write(" \n");
      out.write("            ");
}
      out.write(" \n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"btnFinalizaTeste\" value=\"Submit\"/>\n");
      out.write("            <input type=\"hidden\" name=\"nomeUsuário\" value=");
      out.print(request.getParameter("nome"));
      out.write("  />\n");
      out.write("        </form>\n");
      out.write("        <h3>   <a href=\"home.jsp\">Voltar</a></h3>\n");
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
