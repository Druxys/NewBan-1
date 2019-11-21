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
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(name = "InscriptionAdvisorServlet")
public class InscriptionAdvisorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Advisors myuser = new Advisors();

        String lastname = request.getParameter("nom");
        String firstname = request.getParameter("prenom");
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        String roles = request.getParameter("role");
        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        Timestamp date = new Timestamp(System.currentTimeMillis());
        String typAdvisor = request.getParameter("typAdvisor");
        ArrayList<String> errors = new ArrayList<String>();

        System.out.println(lastname + firstname);

        myuser
                .setFirstName(firstname)
                .setLastName(lastname)
                .setMail(mail)
                .setPassword(generatedSecuredPasswordHash)
                .setCreated_at(date)
                .setUpdated_at(null)
                .setIs_enabled(true)
                .setType_advisor(typAdvisor)
                .setRoles(roles)
        ;
//        System.out.println("DATA :"+ myuser.getCreated_at());
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
        System.out.println(errors);
        if (errors.isEmpty()) {
            HashMap map = new HashMap();
            map.put("Advisors", "ROLE_ADVISOR");
            map.put("Admins", "ROLE_ADMIN");
            Database.insert(myuser);
        }else {
            request.setAttribute("errors", errors);
            HashMap map = new HashMap();
            map.put("Advisors", "ROLE_ADVISOR");
            map.put("Admins", "ROLE_ADMIN");
            request.getRequestDispatcher("inscriptionadvisor.jsp").forward(request, response);
        }

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