package Servlet;

import Models.Products;
import Utils.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductNoteServlet")
public class ProductNoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            Products myProduct = new Products();
            ArrayList<String> fields = new ArrayList<>();
            ArrayList filter = new ArrayList();
        System.out.println(fields);
        List test = Database.select(myProduct, fields, filter);


        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
