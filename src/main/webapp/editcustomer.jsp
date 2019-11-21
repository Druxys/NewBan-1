<%@ page import="Models.Customers" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 12/11/2019
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    List<Customers> app= (List<Customers>) request.getAttribute("res");
    if (app != null) {
        for (Customers users : app) {
    HashMap map = (HashMap) request.getAttribute("tab");
    HashMap map1 = (HashMap) request.getAttribute("tab1");
    HashMap map2 = (HashMap) request.getAttribute("tab2");
%>
<div class="products">
    <form action="edit" method="post" class="text-center border border-light p-5 addproducts" accept-charset="x-iso-8859-1">
        <input type="hidden" value="<%=users.getId()%>" name="id" id="id">
        <label for="nom" class="font-weight-light h4">LastName</label>
        <br><input type="text" name="nom" id="nom" value="<%=users.getLastName()%>" class="form-control"/>
        <br><label for="prenom" class="font-weight-light h4">FirstName</label>
        <br><input type="text" name="prenom" id="prenom" value="<%=users.getFirstName()%>" class="form-control"/>
        <br><label for="email" class="font-weight-light h4">Mail</label>
        <br><input type="email" name="email" id="email" value="<%=users.getMail()%>" class="form-control"/>
        <br><label for="phone" class="font-weight-light h4">Phone</label>
        <br><input type="number" name="phone" id="phone" value="0<%=users.getPhone()%>" class="form-control"/>
        <br><label for="debt" class="font-weight-light h4">Debt</label>
        <br><input type="number" value="<%=users.getDebt()%>" step="0.01" min="0" max="10" id="debt" name="debt" class="form-control"/>
        <br><label for="family_situation" class="font-weight-light h4">Family Situation</label>
        <br>
        <select name="family_situation" id="family_situation" class="browser-default custom-select form-control">
            <option><%=users.getFamilly_situation()%></option>
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
            <option><%=users.getProfessionnal_situation()%></option>
            <option><%=map.get("chomeur")%></option>
            <option><%=map.get("activité")%></option>
            <option><%=map.get("employé")%></option>
            <option><%=map.get("intermediaire")%></option>
            <option><%=map.get("supérieure")%></option>
        </select>
        <br><label for="income" class="font-weight-light h4">Incorne</label>
        <br><input type="number" name="income" id="income" value="<%=users.getIncome()%>" class="form-control"/>
        <br><label for="is_customer" class="font-weight-light h4">Client</label>
        <br><input type="checkbox" name="is_customer" id="is_customer" class="form-control" <%if (users.getIs_customer()){%>checked<%}%>>
        <br><label for="existing_contract" class="font-weight-light h4">Exixting Contract</label>
        <br><input type="checkbox" name="existing_contract" id="existing_contract" class="form-control" <%if (users.getExisting_contract()){%>checked<%}%>>
        <br><label for="contract_type" class="font-weight-light h4">Contract Type</label>
        <br>
        <select name="contract_type" id="contract_type" class="browser-default custom-select form-control">
            <option><%=users.getContract_type()%></option>
            <option><%=map1.get("CDI")%></option>
            <option><%=map1.get("CDD")%></option>
            <option><%=map1.get("Intérim")%></option>
        </select>
        <br>
        <br><input type="submit" value="Edit" class="form-control">
    </form>
</div>

</body>
</html>
<%
    }}
%>
<%@include file="structures/footer.jsp"%>