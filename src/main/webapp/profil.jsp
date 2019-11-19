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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    List<Customers> app= (List<Customers>) request.getAttribute("res");
    if (app != null) {
        for (Customers users : app) {
%>


<div class="container">
    <h1>Profil de <%=users.getFirstName()%></h1>
    <hr>
    <div class="row">
        <!-- edit form column -->
        <div class="col-md-9 personal-info">
            <h3>Infos Personnelles</h3>
            <div class="form-group">
                <label class="col-lg-3 control-label">FirstName :</label>
                <div class="col-lg-8">
                    <%=users.getFirstName()%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 control-label">LastName :</label>
                <div class="col-lg-8">
                    <%=users.getLastName()%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 control-label">Mail :</label>
                <div class="col-lg-8">
                    <%=users.getMail()%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 control-label">Phone :</label>
                <div class="col-lg-8">
                    0<%=users.getPhone()%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4 control-label">Professionnal Situation :</label>
                <div class="col-lg-8">
                    <%=users.getProfessionnal_situation()%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4 control-label">Family Situation :</label>
                <div class="col-lg-8">
                    <%=users.getFamilly_situation()%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4 control-label">Is Customer :</label>
                <div class="col-lg-8">
                    <%=users.getIs_customer()%>
                </div>
            </div>
        </div>
    </div>
    <button>
        <a href="toto">BACK</a>
    </button>
    <button>
        <a href="edit?id=<%=users.getId()%>">Edit</a>
    </button>
</div>
<hr>
<%
        }}
%>

<%@include file="structures/footer.jsp"%>
