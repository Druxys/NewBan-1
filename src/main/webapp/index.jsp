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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<% List<Customers> app= (List<Customers>) request.getAttribute("res");
    SimpleDateFormat sdf = new SimpleDateFormat("d/M/Y H:m");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
%>

<h1>Tableau des Utilisateurs</h1>
<hr class="red lighten-5"/>
<%--<c:forEach items="<%=app%>" var="res">--%>
<%--    <table class="table">--%>
<%--        <td><c:out value="${res.id}"/></td>--%>
<%--        <td>${res.email}</td>--%>
<%--        <td><c:out value="${res.firstname}"/></td>--%>
<%--        <td><c:out value="${res.email}"/></td>--%>
<%--    </table>--%>
<%--</c:forEach>--%>


<table class="table table-bordered text-center">
    <thead>
    <tr class="text-uppercase">
        <th scope="col">Name</th>
        <th scope="col">LastName</th>
        <th scope="col">Email</th>
        <th scope="col">Debt</th>
<%--        <th scope="col">BirthDate</th>--%>
        <th scope="col">Existing Contract</th>
        <th scope="col">Customer</th>
        <th scope="col">Created_at</th>
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
        <th scope= "col"><%=users.getEmail() %></th>
        <th scope= "col"><%=users.getDebt() %></th>
<%--        <th scope= "col"><%=sdf1.format(users.getBirthdate()) %></th>--%>
        <th scope= "col"><%=users.getExisting_contract() %></th>
        <th scope= "col"><%=users.getIs_customer() %></th>
        <th scope= "col"><%=sdf.format(users.getCreated_at()) %></th>
        <th scope="col">
            <a href="profil?id=<%=users.getId()%>">Profil</a>
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


