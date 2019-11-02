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
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("prenom")) {
                request.setAttribute("prenom", cookie.getValue());
            }
            if (cookie.getName().equals("id")){
                request.setAttribute("id", cookie.getValue());
            }
        }
    }
%>
<%
    String prenom = "";
    String id = "";
%>
<div>
<% if (request.getAttribute("prenom") != null && request.getAttribute("id") != null) {
    prenom = (String) request.getAttribute("prenom");
    id = (String) request.getAttribute("id");
%>
    <p>Mon Cher <%=id%> <%=prenom%></p>
<%
}%>
</div>

<h1 class="mb-lg-5 text-center mt-lg-5">BIENVENUE</h1>

<%@include file="structures/footer.jsp"%>
