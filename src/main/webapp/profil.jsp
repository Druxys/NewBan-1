<%@ page import="Models.Customers" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%--
  Created by IntelliJ IDEA.
  User: 17347
  Date: 15/10/2019
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    List<Customers> app= (List<Customers>) request.getAttribute("res");
    if (app != null) {
        for (Customers users : app) {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
%>


<div class="container text-center">

    <h1>Profil de <%=users.getFirstName()%> <%=users.getLastName()%></h1>
    <h3>Infos Personnelles</h3>


    <div class="row">
        <!-- edit form column -->
        <div class="col">
            <div class="personal-info">
                <h5>FirstName</h5>
                <h6><%=users.getFirstName()%></h6>
            </div>
            <div class="personal-info">
                <h5>LastName</h5>
                <h6><%=users.getLastName()%></h6>
            </div>
            <div class="personal-info">
                <h5>Mail</h5>
                <h6><%=users.getMail()%></h6>
            </div>
            <div class="personal-info">
                <h5>Phone</h5>
                <h6>0<%=users.getPhone()%></h6>
            </div>
            <div class="personal-info">
                <h5>Is Customer</h5>
                <h6><%=users.getIs_customer()%></h6>
            </div>
            <div class="personal-info">
                <h5>Existing Contract</h5>
                <h6><%=users.getExisting_contract()%></h6>
            </div>
        </div>
        <div class="col">
            <div class="personal-info">
                <h5>Familly Situation</h5>
                <h6><%=users.getFamilly_situation()%></h6>
            </div>
            <div class="personal-info">
                <h5>Professionnal Situation</h5>
                <h6><%=users.getProfessionnal_situation()%></h6>
            </div>
            <div class="personal-info">
                <h5>Contract Type</h5>
                <h6><%=users.getContract_type()%></h6>
            </div>
            <div class="personal-info">
                <h5>Debt</h5>
                <h6><%=users.getDebt()%></h6>
            </div>
            <div class="personal-info">
                <h5>Income</h5>
                <h6><%=users.getIncome()%></h6>
            </div>
            <div class="personal-info">
                <h5>Created At</h5>
                <h6><%=sdf.format(users.getCreated_at())%></h6>
            </div>
        </div>
    </div>
</div>

<%
        }}
%>

<%@include file="structures/footer.jsp"%>
