<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    String prenom = "";
    System.out.println(session.getAttribute("role"));
    System.out.println(session.getAttribute("id"));
%>
<div>
<% if (session.getAttribute("name") != null){
    prenom = (String) session.getAttribute("name");
%>
    <p>Mon Cher <%=prenom%></p>
<%
}%>
</div>

<div class="container">
    <!-- Grid row -->
    <div class="row">
        <!-- Grid column -->
        <div class="col-lg-4 col-md-12">
            <!--Card-->
            <div class="card">
                <div class="table-wrapper-scroll-y my-custom-scrollbar">

                    <table class="table table-bordered table-striped mb-0">
                        <thead>
                        <tr>
                            <th scope="col">Prénom</th>
                            <th scope="col">Nom</th>
                            <th scope="col">Produit recommandé</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>Compte courant</td>
                        </tr>
                        <tr>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>Livret jeune</td>
                        </tr>
                        <tr>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Assurance vie</td>
                        </tr>
                        <tr>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>Compte courant</td>
                        </tr>
                        <tr>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>Crédit</td>
                        </tr>
                        <tr>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Conpte courantr</td>
                        </tr>
                        <tr>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Livret A</td>
                        </tr>
                        <tr>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>Assurance vie</td>
                        </tr>
                        </tbody>
                    </table>

                </div>
            </div>
            <!--/.Card-->

        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-lg-6 col-md-6">
            <div class="float-left">

            </div>
            <!--Card-->
            <div class="card">
                <p>Sats</p>
            </div>
            <!--/.Card-->
        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <!--        <div class="float-left">-->
        <div class="col-lg-6">
            <div class="float">
                <div class="card">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar-history">
                        <table id="table" class="table table-hover table-mc-light-blue">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nom</th>
                                <th>Contrats proposés</th>
                                <th>Souscrit ou non</th>
                                <th>Mail</th>
                                <th>Téléphone</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td data-title="ID">1</td>
                                <td data-title="Name">Client</td>
                                <td data-title="Link">
                                    <a href="https://github.com/zavoloklom/material-design-color-palette" target="_blank">Livret A</a>
                                </td>
                                <td data-title="Status">Oui</td>
                                <td data-title="mail">bonjour@gmail.com</td>
                                <td data-title="Name">0606060606</td>
                            </tr>
                            <tr>
                                <td data-title="ID">2</td>
                                <td data-title="Name">Client</td>
                                <td data-title="Link">
                                    <a href="https://codepen.io/zavoloklom/pen/uqCsB" target="_blank">Livret A</a>
                                </td>
                                <td data-title="Status">Oui</td>
                                <td data-title="mail">bonjour@gmail.com</td>
                                <td data-title="Name">0606060606</td>
                            </tr>
                            <tr>
                                <td data-title="ID">3</td>
                                <td data-title="Name">Client</td>
                                <td data-title="Link">
                                    <a href="https://codepen.io/zavoloklom/pen/eNaEBM" target="_blank">Livret A</a>
                                    <a href="https://github.com/zavoloklom/material-design-hierarchical-display" target="_blank">GitHub</a>
                                </td>
                                <td data-title="Status">Oui</td>
                                <td data-title="mail">bonjour@gmail.com</td>
                                <td data-title="Name">0606060606</td>
                            </tr>
                            <tr>
                                <td data-title="ID">4</td>
                                <td data-title="Name">Client</td>
                                <td data-title="Link"><a href="https://codepen.io/zavoloklom/pen/dIgco" target="_blank">Livret A</a></td>
                                <td data-title="Status">Oui</td>
                                <td data-title="mail">bonjour@gmail.com</td>
                                <td data-title="Name">0606060606</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>

                </div>
            </div>
        </div>
        <!--        </div>-->

        <!-- Grid column -->
    </div>
    <!-- Grid row -->
</div>

<%@include file="structures/footer.jsp"%>
