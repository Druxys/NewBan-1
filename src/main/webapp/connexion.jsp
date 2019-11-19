<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<%@ page import="Servlet.LoginServlet" %>
<%@ page import="java.util.ArrayList" %>

<div class="box">
    <!-- Default form login -->
    <form class="text-center border border-light p-5 login" action="" method="post">

        <p class="h4 mb-4">Connexion</p>
        <%
            if (request.getAttribute("errors") != null){
                ArrayList error = (ArrayList) request.getAttribute("errors");
        %>
        <h2 >
            <%out.print(error.get(0));}%>

        </h2>
        <!-- Email -->
        <input type="email" id="mail" class="form-control mb-4" placeholder="E-mail" name="mail">

        <!-- Password -->
        <input type="password" id="password" class="form-control mb-4" placeholder="Mot de passe" name="password">

        <div class="d-flex justify-content-around">
<%--            <div>--%>
<%--                <!-- Remember me -->--%>
<%--                <div class="custom-control custom-checkbox">--%>
<%--                    <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">--%>
<%--                    <label class="custom-control-label" for="defaultLoginFormRemember">Se rappeler de moi</label>--%>
<%--                </div>--%>
<%--            </div>--%>
            <div>
                <!-- Forgot password -->
                <a href="forgotPwd.php">Mot de passe oublié ?</a>
            </div>
        </div>

        <!-- Sign in button -->
        <button class="btn btn-info btn-block my-4" type="submit">Connexion</button>

    </form>
</div>

<%@include file="structures/footer.jsp"%>
