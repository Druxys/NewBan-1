package Servlet;

import Models.Customers;
import Utils.Database;

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
import java.util.HashMap;


@WebServlet(name = "InscriptionServlet")
public class InscriptionCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Customers myuser = new Customers();
        HttpSession session = request.getSession();
        String lastname = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String mail = request.getParameter("email");
        Integer phone = Integer.valueOf(request.getParameter("phone"));
        Double debt = Double.valueOf(request.getParameter("debt"));
        Integer income = Integer.valueOf(request.getParameter("income"));
        String birthdate = request.getParameter("birthdate");
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
        String family_situation = request.getParameter("familly_situation");
        String professional_situation = request.getParameter("professional_situation");
        String contract_type = request.getParameter("contract_type");



        myuser
                .setLastName(lastname)
                .setFirstName(firstname)
                .setMail(mail)
                .setPhone(phone)
                .setBirthdate(birthdate)
                .setContract_type(contract_type)
                .setDebt((Double) debt)
                .setExisting_contract(existing_contract)
                .setFamilly_situation(family_situation)
                .setProfessionnal_situation(professional_situation)
                .setIs_customer(is_customer)
                .setIncome(income)
                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                .setUpdated_at(null)
                .setId((Integer)session.getAttribute("id"))
        ;

        Database.insert(myuser);

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
            String message = "Bravo , vous avez enregistré Mr " + name + " au sein de notre banque!";

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
}
