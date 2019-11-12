package Servlet;

import Models.Customers;
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

@WebServlet(name = "EditCustomerServlet")
public class EditCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customers myuser = new Customers();
        ArrayList<String> fields = new ArrayList<>();
        ArrayList filter = new ArrayList();
        Integer id = Integer.valueOf(request.getParameter("id"));
        fields.add("*");
        filter.add(Filtre.add("=", "id", id));

        List var = Database.select(myuser, fields, filter);
        request.setAttribute("res", var);

        request.getRequestDispatcher("editcustomer.jsp").forward(request, response);
    }
}
