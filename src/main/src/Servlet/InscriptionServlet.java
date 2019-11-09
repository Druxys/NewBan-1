package Servlet;

import Models.Advisors;
import Utils.Database;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;


@WebServlet(name = "InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Advisors myuser = new Advisors();
        String name = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String roles = request.getParameter("test");
        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));



        myuser
                .setName(name)
                .setFirstName(firstname)
                .setEmail(email)
                .setPassword(generatedSecuredPasswordHash)
                .setRoles(roles)
                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                .setUpdated_at(null)
                .setIs_enabled(true)
        ;

        Database.insert(myuser);

        response.sendRedirect(request.getContextPath()+"/connexion");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap map = new HashMap();
        map.put("advisors", "ROLE_ADVISOR");
        map.put("admins", "ROLE_ADMIN");
        System.out.println(map);

        request.setAttribute("tab", map);

        request.getRequestDispatcher("inscription.jsp").forward(request, response);
    }
}
