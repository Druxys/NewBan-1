<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    String prenom = "";
    System.out.println(session.getAttribute("role"));
    System.out.println(session.getAttribute("id"));
%>
<div>
<% if (session.getAttribute("name") != null){
    prenom = (String) session.getAttribute("name");
%>
    <p>Mon Cher <%=prenom%></p>
<%
}%>
</div>

<h1 class="mb-lg-5 text-center mt-lg-5">BIENVENUE</h1>

<%@include file="structures/footer.jsp"%>
