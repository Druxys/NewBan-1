package Servlet;

import Models.Users;
import Utils.Database;
import Utils.Filtre;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users myuser = new Users();
        List<String> usermail = new ArrayList<>();

        //Initialisation de tout les champs
        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");

        ArrayList filters = new ArrayList<>();
        String email = request.getParameter("emil");
        List<Users> var = Database.select(myuser, fields);

        for (Users users : var){
            usermail.add(users.getEmail());
        }

        if (usermail.contains(email)){
            System.out.println("Coucou");
            //Ajout des simples guillemets pour permettre la lecture d'une chaîne de caractère lors de la requête
            email = "'" + email + "'";
            //Ajout de filtres à ce moment la pour prendre en considération les simples guillemets
            filters.add(Filtre.add("=", "email", email));
            List<Users> var2 = Database.select(myuser, fields, filters);
            String password = "";
            //Récup du mot de passe
            for (Users users1 : var2){
                password = users1.getPassword();
            }
            //Comparaison et validation si tout est bon
            if (BCrypt.checkpw(request.getParameter("password"), password)){
                Cookie cookie = new Cookie("prenom", request.getParameter("emil"));
                cookie.setMaxAge(60);
                response.addCookie(cookie);

                response.sendRedirect("session");
            }
        } else {
            System.out.println("dommage");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("connexion.jsp").forward(request, response);
    }
}
