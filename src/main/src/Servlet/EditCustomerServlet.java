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
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EditCustomerServlet")
public class EditCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customers customers = new Customers();

        HttpSession session = request.getSession();
        String name = request.getParameter("lastname");
        String firstname = request.getParameter("fistname");
        String email = request.getParameter("email");
        Boolean is_customer;
        if (request.getParameter("is_customer") != null){
            is_customer = true;
        } else {
            is_customer = false;
        }
        Boolean existing_contract;
        if (request.getParameter("existing_contract") != null){
            existing_contract = true;
        } else {
            existing_contract = false;
        }
        Integer phone = Integer.valueOf(request.getParameter("phone"));
        Float debt = Float.valueOf(request.getParameter("debt"));
        Integer income = Integer.valueOf(request.getParameter("income"));
        Date birthdate = Date.valueOf(request.getParameter("birthdate"));


        customers
                .setLastName(name)
                .setFirstName(firstname)
                .setMail(email)
                .setExisting_contract(existing_contract)
                .setIs_customer(is_customer)
                .setPhone(phone)
        ;

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customers customers = new Customers();
        ArrayList<String> fields = new ArrayList<>();
        ArrayList filter = new ArrayList();
        Integer id = Integer.valueOf(request.getParameter("id"));
        fields.add("*");
        filter.add(Filtre.add("=", "id", id));


        List var = Database.select(customers, fields, filter);
        request.setAttribute("res", var);

        request.getRequestDispatcher("editcustomer.jsp").forward(request, response);
    }
}
