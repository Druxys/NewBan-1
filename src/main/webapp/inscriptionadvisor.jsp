<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    HashMap map = (HashMap) request.getAttribute("role");
%>

<form action="advisor" method="post" class="text-center border border-light p-5">
    <label for="nom">Nom</label>
    <br><input type="text" name="nom" id="nom" placeholder="Votre Nom">
    <br><label for="prenom">Pr�nom</label>
    <br><input type="text" name="prenom" id="prenom" placeholder="Votre Pr�nom">
    <br><label for="email">Email</label>
    <br><input type="email" name="email" id="email" placeholder="Votre Email">
    <br><label for="password">Password</label>
    <br><input type="password" name="password" id="password">
    <br><label for="role">Role</label>
    <br>
    <select name="role" id="role">
        <option value="">--Please choose an option--</option>
        <option><%=map.get("Advisors")%></option>
        <option><%=map.get("Admins")%></option>
    </select>
    <br><input type="submit" value="Inscription">
</form>

</body>
</html>

<%@include file="structures/footer.jsp"%>