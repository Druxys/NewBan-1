package Servlet;

import Models.Users;
import Utils.Database;
import Utils.Filtre;
import Utils.Messages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "Demo")
public class Demo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Users myuser = new Users();
        ArrayList fields = new ArrayList();
        Filtre.add(fields,"=", "email", "michel@exemple.com");
        Filtre.add(fields,"<", "name", "michel");
        System.out.println(fields);
//        fields.add("name");
//        fields.add("id");
//        fields.add("firstName");
//        fields.add("email");
        List var = Database.select(myuser, fields);
        System.out.println(var);

//        Messages.sendMessage("test", "allo", "alexandrefy@wanadoo.fr", "theluffy@hotmail.fr");

        request.setAttribute("res", var);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
