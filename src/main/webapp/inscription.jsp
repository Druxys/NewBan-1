<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="structures/header.jsp"%>
<%
    HashMap map = (HashMap) request.getAttribute("tab");
    HashMap map1 = (HashMap) request.getAttribute("tab1");
    HashMap map2 = (HashMap) request.getAttribute("tab2");
%>

<form action="inscription" method="post" class="text-center border border-light p-5">
    <%
        if (request.getAttribute("errors") != null){
            ArrayList error = (ArrayList) request.getAttribute("errors");
    %>
    <span class="erreur" >
        <p>
            <%out.print(error.get(0));}%>
            <br/>
        </p>
    </span>
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
    <br><label for="familly_situation">Familly Situation</label>
    <br>
    <select name="familly_situation" id="familly_situation">
        <option>--Please choose an option--</option>
        <option><%=map.get("test")%></option>
        <option><%=map.get("alpha")%></option>
    </select>
    <br><label for="professional_situation">Professional Situation</label>
    <br>
    <select name="professional_situation" id="professional_situation" multiple>
        <option>--Please choose an option--</option>
        <option><%=map1.get("test1")%></option>
        <option><%=map1.get("test2")%></option>
        <option><%=map1.get("test3")%></option>
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
        <option><%=map2.get("test1")%></option>
        <option><%=map2.get("test2")%></option>
        <option><%=map2.get("test3")%></option>
    </select>
    <br>
    <br><input type="submit" value="Inscription">
</form>

</body>
</html>

<%@include file="structures/footer.jsp"%>