<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 02/11/2019
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>

<%String prenom = (String) request.getAttribute("prenom");%>
<% if (prenom != null){
    out.println(prenom);
}%>
<form method="post" action="session">
    <p>
        <label for="nom">Nom : </label>
        <input type="text" name="nom" id="nom" />
    </p>
    <p>
        <label for="prenom">Prénom : </label>
        <input type="text" name="prenom" id="prenom" />
    </p>

    <input type="submit" />
</form>

<%@include file="structures/footer.jsp"%>
