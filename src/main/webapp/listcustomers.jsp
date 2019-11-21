<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="Models.Customers" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: 17347
  Date: 15/10/2019
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>
<% List<Customers> app= (List<Customers>) request.getAttribute("res");%>

<h1>Tableau des Utilisateurs</h1>
<hr class="red lighten-5"/>

<table class="table table-bordered text-center">
    <thead>
    <tr class="text-uppercase">
        <th scope="col">Name</th>
        <th scope="col">LastName</th>
        <th scope="col">Email</th>
        <th scope="col">Familly Situation</th>
        <th scope="col">Professionnal Situation</th>
        <th scope="col">Debt</th>
        <th scope="col">Income</th>
        <th scope="col">Existing Contract</th>
        <th scope="col">Customer</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <%
        if (app != null) {
            for (Customers users : app) {
                System.out.println(users);%>
    <tbody>
    <tr>
        <th scope= "col"><%=users.getLastName() %></th>
        <th scope= "col"><%=users.getFirstName() %></th>
        <th scope= "col"><%=users.getMail() %></th>
        <th scope= "col"><%=users.getFamilly_situation()%></th>
        <th scope="col"><%=users.getProfessionnal_situation()%></th>
        <th scope= "col"><%=users.getDebt() %></th>
        <th scope="col"><%=users.getIncome()%></th>
        <th scope= "col"><%=users.getExisting_contract() %></th>
        <th scope= "col"><%=users.getIs_customer() %></th>
        <th scope="col">
            <a href="profil?id=<%=users.getId().toString()%>">Profil</a>
            <a href="edit?id=<%=users.getId()%>">Edit</a>
        </th>
    </tr>
    </tbody>
    <%
            } } else {
            out.println("Bonjour");
        }
    %>
</table>

<%@include file="structures/footer.jsp"%>


