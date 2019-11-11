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
import java.util.HashMap;

@WebServlet(name = "InscriptionAdvisorServlet")
public class InscriptionAdvisorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Advisors myuser = new Advisors();
        HttpSession session = request.getSession();
        String name = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String roles = request.getParameter("role");
        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));

        myuser
                .setName(name)
                .setLastName(firstname)
                .setEmail(email)
                .setPassword(generatedSecuredPasswordHash)
                .setRoles(roles)
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
