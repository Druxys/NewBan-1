package Servlet;

import Models.Advisor_Customer;
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
        Advisor_Customer advisorCustomer = new Advisor_Customer();
        ArrayList id_customer = new ArrayList();

        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("id");

        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");
        ArrayList filter = new ArrayList();
        filter.add(Filtre.add("=", "id_advisor", id));

        List<Advisor_Customer> test = Database.select(advisorCustomer, fields, filter);
        System.out.println("test : " + test);
        for (Advisor_Customer allouette : test) {
            id_customer.add(allouette.getId_customer());
        }
        System.out.println("id_customer : " + id_customer);

        Object[] id_customers = id_customer.toArray();
        ArrayList filter2 = new ArrayList();
        for (Object object : id_customers) {
            filter2.add(Filtre.add("=", "id", object));
        }

            List<Customers> var2 = Database.select(myuser, fields, filter2);

            System.out.println("var : " + var2);

            request.setAttribute("res", var2);

            request.getRequestDispatcher("index.jsp").forward(request, response);



    }

}
