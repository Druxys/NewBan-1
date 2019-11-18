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
import java.awt.image.AreaAveragingScaleFilter;
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

        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("id");

        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");
        ArrayList filter = new ArrayList();
        filter.add(Filtre.add("=", "id_advisor", id));

        List<Advisor_Customer> test = Database.select(advisorCustomer, fields, filter);
        System.out.println("test : " + test);
        for (Advisor_Customer advisorCustomer1 : test){
            Integer id_customer = advisorCustomer1.getId_customer();
            ArrayList filter1 = new ArrayList();
            List var;
            filter1.add(Filtre.add("=", "id", id_customer));


            var = (Database.select(myuser, fields, filter1));
            System.out.println("var : " + var);

            request.setAttribute("res", var);

            request.getRequestDispatcher("index.jsp").forward(request, response);

        }

    }

}
