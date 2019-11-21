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
    HashMap map = (HashMap) request.getAttribute("tab");
    HashMap map1 = (HashMap) request.getAttribute("tab1");
    HashMap map2 = (HashMap) request.getAttribute("tab2");
%>
<div class="products">
    <form action="inscription" method="post" class="text-center border border-light p-5 addproducts" accept-charset="x-iso-8859-1">
        <label for="nom" class="font-weight-light h4">LastName</label>
        <br><input type="text" name="nom" id="nom" placeholder="Votre Nom" class="form-control">
        <br><label for="prenom" class="font-weight-light h4">FirstName</label>
        <br><input type="text" name="prenom" id="prenom" placeholder="Votre Prénom" class="form-control">
        <br><label for="email" class="font-weight-light h4">Mail</label>
        <br><input type="email" name="email" id="email" placeholder="Votre Email" class="form-control">
        <br><label for="phone" class="font-weight-light h4">Phone</label>
        <br><input type="number" name="phone" id="phone" placeholder="0658962345" class="form-control">
        <br><label for="debt" class="font-weight-light h4">Debt</label>
        <br><input type="number" placeholder="1.0" step="0.01" min="0" max="10" id="debt" name="debt" class="form-control">
        <br><label for="family_situation" class="font-weight-light h4">Family Situation</label>
        <br>
        <select name="family_situation" id="family_situation" class="browser-default custom-select form-control">
            <option>--Please choose an option--</option>
            <option><%=map2.get("marié")%></option>
            <option><%=map2.get("pacsé")%></option>
            <option><%=map2.get("divorcé")%></option>
            <option><%=map2.get("séparé")%></option>
            <option><%=map2.get("célibataire")%></option>
            <option><%=map2.get("veuf")%></option>
        </select>
        <br><label for="professional_situation" class="font-weight-light h4">Professional Situation</label>
        <br>
        <select name="professional_situation" id="professional_situation" class="browser-default custom-select form-control">
            <option>--Please choose an option--</option>
            <option><%=map.get("chomeur")%></option>
            <option><%=map.get("activité")%></option>
            <option><%=map.get("employé")%></option>
            <option><%=map.get("intermediaire")%></option>
            <option><%=map.get("supérieure")%></option>
        </select>
        <br><label for="income" class="font-weight-light h4">Incorne</label>
        <br><input type="number" name="income" id="income" placeholder="5" class="form-control">
        <br><label for="birthdate" class="font-weight-light h4">Birthdate</label>
        <br><input type="date" name="birthdate" id="birthdate" class="form-control">
        <br><label for="is_customer" class="font-weight-light h4">Client</label>
        <br><input type="checkbox" name="is_customer" id="is_customer" class="form-control">
        <br><label for="existing_contract" class="font-weight-light h4">Exixting Contract</label>
        <br><input type="checkbox" name="existing_contract" id="existing_contract" class="form-control">
        <br><label for="contract_type" class="font-weight-light h4">Contract Type</label>
        <br>
        <select name="contract_type" id="contract_type" class="browser-default custom-select form-control">
            <option>--Please choose an option--</option>
            <option><%=map1.get("CDI")%></option>
            <option><%=map1.get("CDD")%></option>
            <option><%=map1.get("Intérim")%></option>
        </select>
        <br>
        <br><input type="submit" value="Inscription" class="form-control">
    </form>
</div>

</body>
</html>

<%@include file="structures/footer.jsp"%>