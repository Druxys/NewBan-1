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
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "EditCustomerServlet")
public class EditCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customers myuser = new Customers();
        HttpSession session = request.getSession();
        String name = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String email = request.getParameter("email");
        Integer phone = Integer.valueOf(request.getParameter("phone"));
        Double debt = Double.valueOf(request.getParameter("debt"));
        Integer income = Integer.valueOf(request.getParameter("income"));
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
        String family_situation = request.getParameter("family_situation");
        String professional_situation = request.getParameter("professional_situation");
        String contract_type = request.getParameter("contract_type");
        Integer id_customer = Integer.valueOf(request.getParameter("id"));


        myuser
                .setLastName(name)
                .setFirstName(firstname)
                .setMail(email)
                .setPhone(phone)
                .setBirthdate(myuser.getBirthdate())
                .setContract_type(contract_type)
                .setDebt((Double) debt)
                .setExisting_contract(existing_contract)
                .setFamilly_situation(family_situation)
                .setProfessionnal_situation(professional_situation)
                .setIs_customer(is_customer)
                .setIncome(income)
                .setCreated_at(myuser.getCreated_at())
                .setUpdated_at(Timestamp.valueOf(LocalDateTime.now()))
        ;

        Database.updateId(myuser, id_customer);

        String to = (String) session.getAttribute("mail");
        String subject = "Modification confirmé";
        String message = "Bravo , vous avez modifié le profil de Mr " + name + " au sein de notre banque!";

        Messages.sendMessage(subject, message, to, "12newban12@gmail.com");

        response.sendRedirect(request.getContextPath()+"/listcustomers");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customers customers = new Customers();
        ArrayList<String> fields = new ArrayList<>();
        ArrayList filter = new ArrayList();
        Integer id = Integer.valueOf(request.getParameter("id"));
        fields.add("*");
        filter.add(Filtre.add("=", "id", id));

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


        List var = Database.select(customers, fields, filter);
        request.setAttribute("res", var);

        HttpSession session = request.getSession(true);
        String role = (String) session.getAttribute("role");
        if (role != null){
            System.out.println(role);
            request.getRequestDispatcher("editcustomer.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath()+"/connexion");
        }
    }
}
