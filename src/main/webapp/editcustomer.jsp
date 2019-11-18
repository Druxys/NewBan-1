<%@ page import="Models.Customers" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 12/11/2019
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    List<Customers> app= (List<Customers>) request.getAttribute("res");
    if (app != null) {
        for (Customers users : app) {
            System.out.println(users.getBirthdate());
%>

<div class="container">
    <h1>Editer Profil de <%=users.getFirstName()%></h1>
    <hr>
    <div class="row">
        <!-- edit form column -->
        <div class="col-md-9 personal-info">
            <h3>Infos Personnelles</h3>

            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-lg-3 control-label" for="fistname">FirstName :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="<%=users.getFirstName()%>" id="fistname" name="fistname">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label" for="lastname">LastName :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="<%=users.getLastName()%>" name="lastname" id="lastname">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label" for="email">Mail :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="<%=users.getMail()%>" id="email" name="email">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label" for="is_customer">Is Customer :</label>
                    <div class="col-lg-8 custom-control custom-switch">
                            <input type="checkbox" name="is_customer" id="is_customer" <% if (users.getIs_customer()){%> checked <%}%>/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-4 control-label" for="phone">Phone :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="number" value="0<%=users.getPhone()%>" id="phone" name="phone">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-4 control-label" for="birthdate">Birthdate :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="date" value="<%=users.getBirthdate().%>" name="birthdate" id="birthdate">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label"></label>
                    <div class="col-lg-8">
                        <input type="submit" class="btn btn-primary" value="Save">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<hr>
<%
        }}
%>

<%@include file="structures/footer.jsp"%>
