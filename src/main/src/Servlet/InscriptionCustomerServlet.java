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
import java.sql.Timestamp;
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
        Float debt = Float.valueOf(request.getParameter("debt"));
        Integer income = Integer.valueOf(request.getParameter("income"));
        Date birthdate = Date.valueOf(request.getParameter("birthdate"));
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



        myuser
                .setLastName(lastname)
                .setFirstName(firstname)
                .setMail(mail)
                .setPhone(phone)
                .setBirthdate(birthdate)
                .setProfessionnal_contract_type(contract_type)
                .setDebt((float) debt)
                .setExisting_contract(existing_contract)
                .setFamilly_situation(family_situation)
                .setProfessionnal_situation(professional_situation)
                .setIs_customer(is_customer)
                .setIncome(income)
                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                .setUpdated_at(null)
                .setId((Integer)session.getAttribute("id"))
        ;

        if() {

        }

        Database.insert(myuser);

        response.sendRedirect(request.getContextPath()+"/connexion");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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


        HttpSession session = request.getSession(true);
        String role = (String) session.getAttribute("role");
//        if (role != null){
//            System.out.println(role);
            request.getRequestDispatcher("inscription.jsp").forward(request, response);
//        }else {
//            response.sendRedirect(request.getContextPath()+"/connexion");
//        }
    }
}
