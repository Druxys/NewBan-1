<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 29/10/2019
  Time: 07:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    String error = (String) request.getAttribute("error");
%>


<div class="lol">
    <!-- Default form login -->
    <form class="text-center border border-light p-5 login" action="connexion" method="post">

        <p class="h4 mb-4">Connexion</p>

        <!-- Email -->
        <input type="email" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail" name="emil">

        <!-- Password -->
        <input type="password" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Mot de passe" name="password">

        <div class="d-flex justify-content-around">
            <div>
                <!-- Remember me -->
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
                    <label class="custom-control-label" for="defaultLoginFormRemember">Se rappeler de moi</label>
                </div>
            </div>
            <div>
                <!-- Forgot password -->
                <a href="forgotPwd.php">Mot de passe oubli� ?</a>
            </div>
        </div>

        <!-- Sign in button -->
        <button class="btn btn-info btn-block my-4" type="submit">Connexion</button>

    </form>
</div>

<%@include file="structures/footer.jsp"%>
