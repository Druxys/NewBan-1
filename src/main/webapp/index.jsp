<%@ page import="java.util.List" %>
<%@ page import="Models.Users" %>
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
    <% List<Users> app= (List<Users>) request.getAttribute("res");%>

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


<table class="table table-bordered">
    <%
        if (app != null) {
            for (Users users : app) {
                System.out.println(users);%>
    <tbody>
    <tr>
        <th scope= "col"><%=users.getName() %></th>
        <th scope= "col"><%=users.getFirstName() %></th>
        <th scope= "col"><%=users.getEmail() %></th>
        <th scope= "col"><%=users.getId() %></th>
    </tr>
    </tbody>
    <%
            } } else {
    out.println("Bonjour");
    }
    %>
</table>

<%@include file="structures/footer.jsp"%>


