package Servlet;

import Models.Advisors;
import Models.Customers;
import Utils.Database;
import org.mindrot.jbcrypt.BCrypt;

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
public class InscriptionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customers myuser = new Customers();
        HttpSession session = request.getSession();
        String name = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Integer phone = Integer.valueOf(request.getParameter("phone"));
        Float debt = Float.valueOf(request.getParameter("debt"));
        Integer income = Integer.valueOf(request.getParameter("income"));
        Date birthdate = Date.valueOf(request.getParameter("birthdate"));
        Boolean is_customer = Boolean.valueOf(request.getParameter("is_customer"));
        Boolean existing_contract = Boolean.valueOf(request.getParameter("existing_contract"));
        String family_situation = request.getParameter("family_situation");
        String professional_situation = request.getParameter("professional_situation");
        String contract_type = request.getParameter("contract_type");
//        String roles = request.getParameter("test");
//        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));



        myuser
                .setName(name)
                .setFirstName(firstname)
                .setEmail(email)
                .setPhone(phone)
                .setBirthdate(birthdate)
                .setContract_type(contract_type)
                .setDebt((float) 2.5)
                .setExisting_contract(existing_contract)
                .setFamily_situation(family_situation)
                .setProfessional_situation(professional_situation)
                .setIs_customer(is_customer)
                .setId_advisor((Integer)session.getAttribute("id"))
                .setIncome(income)
//                .setPassword(generatedSecuredPasswordHash)
//                .setRoles(roles)
                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                .setUpdated_at(null)
        ;

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
        if (role != null){
            System.out.println(role);
            request.getRequestDispatcher("inscription.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath()+"/connexion");
        }
    }
}
