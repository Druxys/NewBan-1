<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 02/11/2019
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>

<h1>Envoie de mail</h1>

<form action="mail" method="post">
    To:<input type="text" name="to"  /><br/>
    Subject:<input type="text" name="subject"  /><br/>
    Message:<input type="text" name="message"  /><br/>
    <input type="submit" value="send" />
</form>

<%@include file="structures/footer.jsp"%>
