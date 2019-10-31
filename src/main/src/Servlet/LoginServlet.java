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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Users myuser = new Users();
//        List<String> usermail = new ArrayList<>();
//        String email = request.getParameter("emil");
//        List<Users> var = Database.select(myuser);
//
//        for (Users users : var){
//            usermail.add(users.getEmail());
//        }
//
//        if (usermail.contains(email)){
//            System.out.println("Coucou");
//            List<Users> var2 = Database.selectId(myuser, email);
//            String password = "";
//            System.out.println(var2);
//            for (Users users1 : var2){
//                password = users1.getPassword();
//            }
//            if (BCrypt.checkpw(request.getParameter("password"), password)){
//                System.out.println("Nice");
//            }
//        } else {
//            System.out.println("dommage");
//        }
//
//        request.getRequestDispatcher("connexion.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("connexion.jsp").forward(request, response);
    }
}
