package Servlet;

import Models.Customers;
import Models.Products;
import Utils.Database;
import Utils.Filtre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductNoteServlet")
public class ProductNoteServlet extends HttpServlet {




    public String findAge (String birthday) { String[] values = birthday.split("-", 0);
        return values[2] + "-" + values[1] + "-" + values[0];   }




    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        Integer age;
        Integer ageCustomer;
        Products myProduct = new Products();
        Customers myCustomer = new Customers();
        ArrayList filters = new ArrayList<>();
        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");
        ArrayList filter = new ArrayList();
        System.out.println(fields);

        List<Products> test = Database.select(myProduct, fields);
        List<Customers> customersList =Database.select(myCustomer, fields);
        ArrayList notes = new ArrayList();

        for (Products product : test){
            Integer note = 100;
            System.out.println("DATA:" + product.getName());

            for(Customers customers : customersList){

                System.out.println("DATA:" + customers.getLastName());

                age = product.getAge_min_preferred();
                System.out.println("DATA:" + age);


                System.out.println(customers.getBirthdate().toString());


                if(age != null  && age < 17  ){
                    note = note - 10;
                }
                notes.add(note);
            }




        }

        System.out.println(notes);






        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
