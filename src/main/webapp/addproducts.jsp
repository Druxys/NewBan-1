<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>

<form action="addproducts" method="post" class="text-center border border-light p-5">
    <label for="nom">Nom</label>
    <br><input type="text" name="name" id="name" placeholder="Votre Produit">
    <br><label for="rate">Taux</label>
    <br><input type="text" name="rate" id="rate" placeholder="Taux du produit">
    <br><label for="cap">Plafond</label>
    <br><input type="integer" name="cap" id="cap" placeholder="Plafond">
    <br><label for="duration">Durée</label>
    <br><input type="integer" name="duration" id="duration">
    <br><label for="age_min_preferred">Age minimum conseillé</label>
    <br><input type="integer" name="age_min_preferred" id="age_min_preferred" placeholder="Age minimum conseillé">
    <br><label for="age_max_preferred">Age maximum conseillé</label>
    <br><input type="integer" name="age_max_preferred" id="age_max_preferred" placeholder="Age maximum conseillé">
    <br><label for="income_min_preferred">Revenu minimum conseillé</label>
    <br><input type="integer" name="income_min_preferred" id="income_min_preferred" placeholder="Revenu minimum conseillé">
    <br><label for="income_max_preferred">Revenu maximum conseillé</label>
    <br><input type="integer" name="income_max_preferred" id="income_max_preferred">
    <br><label for="age_min_required">Age minimum requis</label>
    <br><input type="integer" name="age_min_required" id="age_min_required" placeholder="Age minimum requis">
    <br><label for="age_max_required">Age maximum requis</label>
    <br><input type="integer" name="age_max_required" id="age_max_required" placeholder="Age maximum requis">
    <br><label for="income_min_required">Revenu minimum requis</label>
    <br><input type="integer" name="income_min_required" id="income_min_required" placeholder="Revenu minimum requis">
    <br><label for="income_max_required">Revenu maximum requis</label>
    <br><input type="integer" name="income_max_required" id="income_max_required">
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

</body>
</html>

<%@include file="structures/footer.jsp"%>