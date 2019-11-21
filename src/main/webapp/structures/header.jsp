<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Bootstrap core CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.10/css/mdb.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/dark-mode.css">

</head>

<body>
<header>
    <!--Navbar -->
    <nav class="mb-1 navbar navbar-expand-lg navbar-dark lighten-1">
        <a class="navbar-brand" href="index.php">NewBan</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-555"
                aria-controls="navbarSupportedContent-555" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent-555">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="home.jsp">Accueil
                      <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="customers">Clients</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addproducts">Ajout de produit</a>
                </li>
                <li class="nav-item">
<<<<<<< HEAD
                    <a class="nav-link" href="stats">Statistiques</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="historic">Historique</a>
=======
                    <a class="nav-link" href="logs">Historique</a>
>>>>>>> 9db394eb14d33b70bf55be51a1f0c937eabceac6
                </li>
            </ul>
            <ul class="navbar-nav ml-auto nav-flex-icons">
                <% if (session.getAttribute("role") == null){ %>
                <li class="nav-item">
                    <a class="nav-link" href="connexion">Connexion</a>
                </li>
                <%} else {%>
                <li class="nav-item">
                    <a class="nav-link" href="deconnexion">Déconnexion</a>
                </li>
                <%}%>
                <li class="nav-item">
                    <div class="custom-control custom-switch">
                        <input type="checkbox" class="custom-control-input" id="darkSwitch" />
                        <label class="custom-control-label" for="darkSwitch">Dark Mode</label>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
    <!--/.Navbar -->
</header>
<body>