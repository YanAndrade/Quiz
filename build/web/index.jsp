<%-- 
    Document   : index
    Created on : 01/06/2020, 11:29:43
    Author     : rlarg
--%>

<%@page import="db.Transaction"%>
<%@page import="web.DbListener"%>
<%@page import="db.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(request.getParameter("generateTransactionData")!=null){
    Transaction.generateSampleData();
    response.sendRedirect(request.getRequestURI());
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index - FINANCY$</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h2>Index</h2>
        <div>
            <p>
                Bem vindo ao <b><u>FINANCY$</u></b>, sistema de gerenciamento de finanças pessoais.
            </p>
            <p>
                Há um cadastro de categorias pre-estabelecido em que você pode incluir ou remover conforme sua conveniência, e um cadastro de transçações financeira spara registrarar suas receitas e depsesas. 
                Uma página mostrará um relatório consolidado para acompanhamento das suas finanças.
            </p>
            <p>
                Você pode clicar no botão abaixo para gerar uma amostra de transações financeiras fictícias.
                <form>
                    <input type="submit" name="generateTransactionData" value="Gerar Amostra de Transações"/>
                </form>
            </p>
        </div>
    </body>
</html>
