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
<form class="text-center border border-light p-5" action="connexion" method="post">

    <p class="h4 mb-4">Sign in</p>

    <!-- Email -->
    <input type="email" id="email" name="emil" class="form-control mb-4" placeholder="E-mail">

    <!-- Password -->
    <input type="password" id="password" name="password" class="form-control mb-4" placeholder="Password">

    <div class="d-flex justify-content-around">
        <div>
            <!-- Remember me -->
            <div class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
                <label class="custom-control-label" for="defaultLoginFormRemember">Remember me</label>
            </div>
        </div>
    </div>

    <!-- Sign in button -->
    <button class="btn btn-info btn-block my-4" type="submit">Sign in</button>

</form>
<!-- Default form login -->

<%@include file="structures/footer.jsp"%>
