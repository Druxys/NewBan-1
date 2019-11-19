package Servlet;

import Models.Advisors;
import Utils.Database;
import Utils.Filtre;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Advisors myuser = new Advisors();
        List<String> usermail = new ArrayList<>();
        ArrayList error = new ArrayList();

        //Initialisation de tout les champs
        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");

        ArrayList filters = new ArrayList<>();
        String email = request.getParameter("emil");
        List<Advisors> var = Database.select(myuser, fields);

        for (Advisors users : var){
            usermail.add(users.getMail());
        }

        if (usermail.contains(email)){
            System.out.println("Coucou");
            //Ajout des simples guillemets pour permettre la lecture d'une chaîne de caractère lors de la requête
            email = "'" + email + "'";
            //Ajout de filtres à ce moment la pour prendre en considération les simples guillemets
            filters.add(Filtre.add("=", "mail", email));
            List<Advisors> var2 = Database.select(myuser, fields, filters);
            String password = "";
            //Récup du mot de passe
            for (Advisors users1 : var2) {
                password = users1.getPassword();

                //Comparaison et validation si tout est bon
                if (BCrypt.checkpw(request.getParameter("password"), password)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("name", users1.getFirstName());
                    session.setAttribute("role", users1.getRoles());
                    session.setAttribute("id", users1.getId());

                    response.sendRedirect(request.getContextPath() + "/");
                } else {
                    System.out.println("allo");
                }
            }
        } else {
            System.out.println("Try Again");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("connexion.jsp").forward(request, response);
    }
}
