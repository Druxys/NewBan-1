<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<% HashMap map = (HashMap) request.getAttribute("tab");%>

<form action="inscription" method="post" class="text-center border border-light p-5">
    <label for="nom">Nom</label>
    <br><input type="text" name="nom" id="nom" placeholder="Votre Nom">
    <br><label for="prenom">Prénom</label>
    <br><input type="text" name="prenom" id="prenom" placeholder="Votre Prénom">
    <br><label for="email">Email</label>
    <br><input type="email" name="email" id="email" placeholder="Votre Email">
    <br><label for="password">Mot de passe</label>
    <br><input type="password" name="password" id="password" placeholder="Votre Mot de passe">
    <br>
    <select name="test" id="test">
        <option value="">--Please choose an option--</option>
        <option><%=map.get("advisors")%></option>
        <option><%=map.get("admins")%></option>
    </select>
    <br><input type="submit" value="Inscription">
</form>

</body>
</html>

<%@include file="structures/footer.jsp"%>