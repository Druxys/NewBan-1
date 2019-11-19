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
    HashMap map = (HashMap) request.getAttribute("tab");
    HashMap map1 = (HashMap) request.getAttribute("tab1");
    HashMap map2 = (HashMap) request.getAttribute("tab2");
%>

<form action="inscription" method="post" class="text-center border border-light p-5" accept-charset="x-iso-8859-1">
    <label for="nom">Nom</label>
    <br><input type="text" name="nom" id="nom" placeholder="Votre Nom">
    <br><label for="prenom">Prénom</label>
    <br><input type="text" name="prenom" id="prenom" placeholder="Votre Prénom">
    <br><label for="email">Email</label>
    <br><input type="email" name="email" id="email" placeholder="Votre Email">
    <br><label for="phone">Phone</label>
    <br><input type="number" name="phone" id="phone" placeholder="0658962345">
    <br><label for="debt">Debt</label>
    <br><input type="number" placeholder="1.0" step="0.01" min="0" max="10" id="debt" name="debt">
    <br><label for="family_situation">Family Situation</label>
    <br>
    <select name="family_situation" id="family_situation">
        <option>--Please choose an option--</option>
        <option><%=map2.get("marié")%></option>
        <option><%=map2.get("pacsé")%></option>
        <option><%=map2.get("divorcé")%></option>
        <option><%=map2.get("séparé")%></option>
        <option><%=map2.get("célibataire")%></option>
        <option><%=map2.get("veuf")%></option>
    </select>
    <br><label for="professional_situation">Professional Situation</label>
    <br>
    <select name="professional_situation" id="professional_situation">
        <option>--Please choose an option--</option>
        <option><%=map.get("chomeur")%></option>
        <option><%=map.get("activité")%></option>
        <option><%=map.get("employé")%></option>
        <option><%=map.get("intermediaire")%></option>
        <option><%=map.get("supérieure")%></option>
    </select>
    <br><label for="income">Incorne</label>
    <br><input type="number" name="income" id="income" placeholder="5">
    <br><label for="birthdate">Birthdate</label>
    <br><input type="date" name="birthdate" id="birthdate">
    <br><label for="is_customer">Client</label>
    <br><input type="checkbox" name="is_customer" id="is_customer">
    <br><label for="existing_contract">Exixting Contract</label>
    <br><input type="checkbox" name="existing_contract" id="existing_contract">
    <br><label for="contract_type">Contract Type</label>
    <br>
    <select name="contract_type" id="contract_type">
        <option>--Please choose an option--</option>
        <option><%=map1.get("CDI")%></option>
        <option><%=map1.get("CDD")%></option>
        <option><%=map1.get("Intérim")%></option>
    </select>
    <br>
    <br><input type="submit" value="Inscription">
</form>

</body>
</html>

<%@include file="structures/footer.jsp"%>