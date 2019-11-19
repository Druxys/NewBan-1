<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    HashMap map = (HashMap) request.getAttribute("role");
%>

<form action="advisor" method="post" class="text-center border border-light p-5">
    <label for="nom">Nom</label>
    <br><input type="text" name="nom" id="nom" placeholder="Votre Nom">
    <br><label for="prenom">Prénom</label>
    <br><input type="text" name="prenom" id="prenom" placeholder="Votre Prénom">
    <br><label for="mail">Email</label>
    <br><input type="mail" name="mail" id="mail" placeholder="Votre Email">
    <br><label for="password">Password</label>
    <br><input type="password" name="password" id="password">
    <br><label for="role">Role</label>
    <br>
    <select name="role" id="role">
        <option value="">--Please choose an option--</option>
        <option><%=map.get("Advisors")%></option>
        <option><%=map.get("Admins")%></option>
    </select>
    <br><label for="typeAdvisor">Type de conseiller</label>
    <br><input type="typeAdvisor" name="typeAdvisor" id="typeAdvisor">
    <br><input type="submit" value="Inscription">
</form>

</body>
</html>

<%@include file="structures/footer.jsp"%>