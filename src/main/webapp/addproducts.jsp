<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<div class="products">
<form action="addproducts" method="post" class="text-center border border-light p-5 addproducts">
    <p class="h4 mb-4">Ajout d'un produit</p>
    <label for="name" class="font-weight-light h4">Nom</label>
    <br><input type="text" class="form-control" name="name" id="name" placeholder="Votre Produit">
    <br><label for="rate" class="font-weight-light h4">Taux</label>
    <br><input type="text" class="form-control" name="rate" id="rate" placeholder="Taux du produit">
    <br><label for="cap" class="font-weight-light h4">Plafond</label>
    <br><input type="integer" class="form-control" name="cap" id="cap" placeholder="Plafond">
    <br><label for="duration" class="font-weight-light h4">Durée</label>
    <br><input type="integer" class="form-control" name="duration" id="duration" placeholder="Durée">
    <br><label for="age_min_preferred" class="font-weight-light h4">Age minimum conseillé</label>
    <br><input type="integer" class="form-control" name="age_min_preferred" id="age_min_preferred" placeholder="Age minimum conseillé">
    <br><label for="age_max_preferred" class="font-weight-light h4">Age maximum conseillé</label>
    <br><input type="integer" class="form-control" name="age_max_preferred" id="age_max_preferred" placeholder="Age maximum conseillé">
    <br><label for="income_min_preferred" class="font-weight-light h4">Revenu minimum conseillé</label>
    <br><input type="integer" class="form-control" name="income_min_preferred" id="income_min_preferred" placeholder="Revenu minimum conseillé">
    <br><label for="income_max_preferred" class="font-weight-light h4">Revenu maximum conseillé</label>
    <br><input type="integer" class="form-control" name="income_max_preferred" id="income_max_preferred" placeholder="Revenu maximum conseillé">
    <br><label for="age_min_required" class="font-weight-light h4">Age minimum requis</label>
    <br><input type="integer" class="form-control" name="age_min_required" id="age_min_required" placeholder="Age minimum requis">
    <br><label for="age_max_required" class="font-weight-light h4">Age maximum requis</label>
    <br><input type="integer" class="form-control" name="age_max_required" id="age_max_required" placeholder="Age maximum requis">
    <br><label for="income_min_required" class="font-weight-light h4">Revenu minimum requis</label>
    <br><input type="integer" class="form-control" name="income_min_required" id="income_min_required" placeholder="Revenu minimum requis">
    <br><label for="income_max_required" class="font-weight-light h4">Revenu maximum requis</label>
    <br><input type="integer" class="form-control" name="income_max_required" id="income_max_required" placeholder="Revenu maximum requis">
    <br>
    <select name="professionnal_situation_preferred" id="professionnal_situation_preferred">
        <option value="">--Please choose an option--</option>
        <option value="chomeur">Demandeur emploi</option>
        <option value="activité">Sans Activités</option>
        <option value="employé">Employé</option>
        <option value="intermediaire">Intermediaire</option>
        <option value="supérieure">Supérieur</option>
    </select>
    <br>
    <select name="familial_situation_preferred" id="familial_situation_preferred">
        <option value="">--Please choose an option--</option>
        <option value="marié">Marié</option>
        <option value="pacsé">Pacsé</option>
        <option value="divorcé">Divorcé</option>
        <option value="séparé">Séparé</option>
        <option value="célibataire">Célibataire</option>
        <option value="veuf">Veuf</option>
    </select>
    <br><input type="submit" value="Ajouter">
</form>
</div>

</body>
</html>

<%@include file="structures/footer.jsp"%>