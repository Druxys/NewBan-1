<!doctype html>
<html lang="fr">
<head>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Bootstrap core CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.10/css/mdb.min.css" rel="stylesheet">
</head>

<body>
<header>
    <link type="text/css" rel="stylesheet" href="assets/css/style.css">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!--Navbar -->
    <nav class="mb-1 navbar navbar-expand-lg navbar-dark lighten-1">
        <a class="navbar-brand" href="home.jsp">NewBan</a>
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
                    <a class="nav-link" href="connexion">Connexion</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="customers">Clients</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="profil">Profil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addproducts">Ajout de produit</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="stats">Statistiques</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logs">Historique</a>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto nav-flex-icons">
                <li class="nav-item">
                    <a class="nav-link waves-effect waves-light">1
                        <i class="fas fa-envelope"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <div class="custom-control custom-switch">
                        <input type="checkbox" class="custom-control-input" id="darkSwitch" />
                        <label class="custom-control-label" for="darkSwitch">Dark Mode</label>
                    </div>
                </li>
                <li class="nav-item avatar dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-55" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        <img src="https://mdbootstrap.com/img/Photos/Avatars/avatar-2.jpg" class="rounded-circle z-depth-0"
                             alt="avatar image" style="height: 30px; width: 30px;">
                    </a>
                    <div class="dropdown-menu dropdown-menu-lg-right dropdown-secondary"
                         aria-labelledby="navbarDropdownMenuLink-55">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="profil.php">Profil</a>
                        <a class="dropdown-item" href="#">Deconnexion</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
    <!--/.Navbar -->
</header>
<body>