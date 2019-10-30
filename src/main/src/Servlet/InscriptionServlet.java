package Servlet;

import Models.Users;
import Utils.Database;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users myuser = new Users();
        String name = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));

        myuser
                .setName(name)
                .setFirstName(firstname)
                .setEmail(email)
                .setPassword(generatedSecuredPasswordHash)
        ;

        Database.insert(myuser);

        request.getRequestDispatcher("inscription.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("inscription.jsp").forward(request, response);
    }
}
