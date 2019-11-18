package Servlet;

import Models.Advisors;
import Utils.Database;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;

@WebServlet(name = "InscriptionAdvisorServlet")
public class InscriptionAdvisorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Advisors myuser = new Advisors();
        HttpSession session = request.getSession();
        String lastname = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String mail = request.getParameter("email");
        String password = request.getParameter("password");
        String roles = request.getParameter("role");
        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        String type_advisor = request.getParameter("type_advisor");
        Timestamp date = new Timestamp(System.currentTimeMillis());

        myuser
                .setFirstName(firstname)
                .setLastName(lastname)
                .setMail(mail)
                .setPassword(generatedSecuredPasswordHash)
                .setCreated_at(date)
                .setRoles(roles)
                .setType_advisor("customer")
        ;

        Database.insert(myuser);

        response.sendRedirect(request.getContextPath()+"/connexion");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap map = new HashMap();
        map.put("Advisors", "ROLE_ADVISOR");
        map.put("Admins", "ROLE_ADMIN");

        request.setAttribute("role", map);

        request.getRequestDispatcher("inscriptionadvisor.jsp").forward(request, response);

    }
}