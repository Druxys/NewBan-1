<%@ page import="Models.Historics" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>

<% List<Historics> app= (List<Historics>) request.getAttribute("res");
    SimpleDateFormat sdf = new SimpleDateFormat("d/M/Y H:m");
%>

<h1 class="text-center">Historique des prospections</h1>
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
            for (Historics users : app) {
                System.out.println(users);%>
    <tbody>
    <tr>
        <th scope= "col"><%=users.getResume() %></th>
        <th scope= "col"><%=users.getType_contact() %></th>
        <th scope= "col"><%=users.getContact_taken() %></th>
    </tr>
    </tbody>
    <%
            } } else {
            out.println("Historique des actions");
        }
    %>
</table>


<%@include file="structures/footer.jsp"%>