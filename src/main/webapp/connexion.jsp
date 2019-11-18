<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 29/10/2019
  Time: 07:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>

<!-- Default form login -->
<div class="lol">
    <!-- Default form login -->
    <form class="text-center border border-light p-5 login" action="#!">

        <p class="h4 mb-4">Connexion</p>

        <!-- Email -->
        <input type="email" id="email" class="form-control mb-4" placeholder="E-mail">

        <!-- Password -->
        <input type="password" id="password" class="form-control mb-4" placeholder="Mot de passe">

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
                <a href="forgotPwd.jsp">Mot de passe oublié ?</a>
            </div>
        </div>

        <!-- Sign in button -->
        <button class="btn btn-info btn-block my-4" type="submit">Connexion</button>

    </form>
</div>
<!-- Default form login -->
<!-- Default form login -->

<%@include file="structures/footer.jsp"%>
