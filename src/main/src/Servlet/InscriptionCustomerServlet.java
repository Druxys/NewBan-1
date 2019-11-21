package Servlet;

import Models.Advisor_Customer;
import Models.Customers;
import Utils.Database;
import Utils.Filtre;
import Utils.Messages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@WebServlet(name = "InscriptionServlet")
public class InscriptionCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Customers myuser = new Customers();
        HttpSession session = request.getSession();
        String lastname = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String mail = request.getParameter("email");
//        Integer phone = Integer.valueOf(request.getParameter("phone"));
        Integer phone;
        if (request.getParameter("phone") == ""){
            phone = 0;
        } else{
            phone = Integer.valueOf(request.getParameter("phone"));
        }

//        Float debt = Float.valueOf(request.getParameter("debt"));
        Float debt;
        if (request.getParameter("income") == ""){
            debt = (float)0;
        }else
        {
            debt = Float.valueOf(request.getParameter("debt"));
        }
//        Integer income = Integer.valueOf(request.getParameter("income"));
        Integer income;
        if (request.getParameter("income") == ""){
            income = 0;
        }else
        {
            income = Integer.valueOf(request.getParameter("income"));
        }
        String birthdate = String.valueOf(request.getParameter("birthdate"));
        Boolean is_customer;
        if (request.getParameter("is_customer") != null){
            is_customer = true;
        } else {
            is_customer = false;
        }
        Boolean existing_contract;
        if (request.getParameter("existing_contract") != null){
            existing_contract = true;
        } else {
            existing_contract = false;
        }

        String familly_situation = request.getParameter("familly_situation");
        String professional_situation = request.getParameter("professional_situation");
        String contract_type = request.getParameter("contract_type");
        ArrayList<String> errors = new ArrayList<String>();


        myuser
                .setLastName(lastname)
                .setFirstName(firstname)
                .setMail(mail)
                .setPhone(phone)
                .setBirthdate(birthdate)
                .setContract_type(contract_type)
                .setDebt((Float) debt)
                .setExisting_contract(existing_contract)
                .setFamilly_situation(familly_situation)
                .setProfessionnal_situation(professional_situation)
                .setIs_customer(is_customer)
                .setIncome(income)
                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                .setUpdated_at(null)
                .setId((Integer)session.getAttribute("id"))
        ;
        if ( myuser.getLastName() != null && myuser.getLastName().trim().length() < 3 ) {
            errors.add( "Le nom du client doit contenir au moins 3 caractères." );
        }

        if ( myuser.getFirstName() != null && myuser.getFirstName().trim().length() < 3 ) {
            errors.add( "Le prénom du client doit contenir au moins 3 caractères." );
        }

        if ( myuser.getMail() != null && myuser.getMail().trim().length() != 0 ) {
            if ( !myuser.getMail().matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                errors.add( "Merci de saisir une adresse mail valide." );
            }
        } else {
            errors.add( "Merci de saisir une adresse mail." );
        }
        if(myuser.getPhone() == 0) {
            errors.add("Champ téléphone vide.");
        }

        if(myuser.getContract_type() == "") {
            errors.add("Champ contract_type vide.");
        }
        if(myuser.getProfessionnal_situation() == "--Please choose an option--") {
            errors.add("Champ professional_situation vide.");
        }
        if(myuser.getFamilly_situation() == "--Please choose an option--") {
            errors.add("Champ family_situation vide.");
        }
        System.out.println(errors);
        if (errors.isEmpty()) {
            Database.insert(myuser);
        }else {
            request.setAttribute("errors", errors);
            System.out.println("Benoit");
            HashMap map = new HashMap();
            map.put("test", "test");
            map.put("alpha", "alpha");
            HashMap map1 = new HashMap();
            map1.put("test1", "test1");
            map1.put("test2", "test2");
            map1.put("test3", "test3");
            HashMap map2 = new HashMap();
            map2.put("test1", "test1");
            map2.put("test2", "test2");
            map2.put("test3", "test3");
            System.out.println(map);

            request.setAttribute("tab", map);
            request.setAttribute("tab1", map1);
            request.setAttribute("tab2", map2);
            request.getRequestDispatcher("inscription.jsp").forward(request, response);
        }

        ArrayList fields = new ArrayList();
        fields.add("*");
        ArrayList filter = new ArrayList();
        filter.add(Filtre.add("=", "mail", "'"+myuser.getMail()+"'"));

        List<Customers> var = Database.select(myuser, fields, filter);
        Integer id_cust;

        for (Customers customers : var){
            id_cust = customers.getId();
            Advisor_Customer advisor_customer = new Advisor_Customer();

            advisor_customer
                    .setId_advisor((Integer)session.getAttribute("id"))
                    .setId_customer(id_cust)
            ;

            Database.insert(advisor_customer);

            String to = (String) session.getAttribute("mail");
            String subject = "Enregistrement confirmé";
            String message = "Bravo , vous avez enregistré Mr " + lastname + " au sein de notre banque!";

            Messages.sendMessage(subject, message, to, "12newban12@gmail.com");
        }

        response.sendRedirect(request.getContextPath()+"/customers");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HashMap map = new HashMap();
        map.put("chomeur", "Demandeur emploi");
        map.put("activité", "Sans Activités");
        map.put("employé", "Employé");
        map.put("intermediaire", "Intermediaire");
        map.put("supérieure", "Supérieur");

        HashMap map1 = new HashMap();
        map1.put("CDI", "CDI");
        map1.put("CDD", "CDD");
        map1.put("Intérim", "Intérim");

        HashMap map2 = new HashMap();
        map2.put("marié", "Marié");
        map2.put("pacsé", "Pacsé");
        map2.put("divorcé", "Divorcé");
        map2.put("séparé", "Séparé");
        map2.put("célibataire", "Célibataire");
        map2.put("veuf", "Veuf");

        request.setAttribute("tab", map);
        request.setAttribute("tab1", map1);
        request.setAttribute("tab2", map2);


        HttpSession session = request.getSession(true);
        String role = (String) session.getAttribute("role");
        if (role != null){
            System.out.println(role);
            request.getRequestDispatcher("inscription.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath()+"/connexion");
        }
    }

    private void validationEmail( String email ) throws Exception {
        if ( email != null && email.trim().length() != 0 ) {
            if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                throw new Exception( "Merci de saisir une adresse mail valide." );
            }
        } else {
            throw new Exception( "Merci de saisir une adresse mail." );
        }
    }

    private void validationNom( String nom ) throws Exception {
        if ( nom != null && nom.trim().length() < 3 ) {
            throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
        }
    }
}
