<%@ page import="Models.Customers" %>
<%@ page import="java.util.List" %><%--
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
            System.out.println(users);
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
                    <label class="col-lg-3 control-label">Prénom :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label">Nom :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label">Mail :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label">Identifiant :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="text" value="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-4 control-label">Mot de passe :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="password" value="11111122333">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-4 control-label">Confirmer votre mot de passe :</label>
                    <div class="col-lg-8">
                        <input class="form-control" type="password" value="11111122333">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label"></label>
                    <div class="col-lg-8">
                        <input type="button" class="btn btn-primary" value="Sauvegarder">
                        <span></span>
                        <input type="reset" class="btn btn-default" value="Annuler">
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
