package Servlet;

import Models.Users;
import Utils.Database;
import Utils.Filtre;

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
        ArrayList<String> fields = new ArrayList<>();
        ArrayList filter = new ArrayList();


        filter.add( Filtre.add( "=", "name", "'michel'")) ;
        filter.add(Filtre.add("=", "email", "'michel@exemple.com'"));

        System.out.println(fields);
        fields.add("name");
        fields.add("id");
        fields.add("firstName");
        fields.add("email");
        List var = Database.select(myuser, fields, filter);
        System.out.println(var);

        request.setAttribute("res", var);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
