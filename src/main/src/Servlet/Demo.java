package Servlet;

import Models.Customers;
import Utils.Database;
import Utils.Filtre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "Demo")
public class Demo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customers myuser = new Customers();
        HttpSession session = request.getSession();
        ArrayList<String> fields = new ArrayList<>();
        ArrayList filter = new ArrayList();
        Integer id = (Integer) session.getAttribute("id");

//        filter.add( Filtre.add( "=", "id_advisor", id));

        System.out.println(fields);
        fields.add("*");
        List var = Database.select(myuser, fields);
        System.out.println(var);

        request.setAttribute("res", var);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
