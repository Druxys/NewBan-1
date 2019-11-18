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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@WebServlet(name = "ProductNoteServlet")
public class ProductNoteServlet extends HttpServlet {




    public String findAge (String birthday) { String[] values = birthday.split("-", 0);
        return values[2] + "-" + values[1] + "-" + values[0];   }




    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        Integer age;
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


                java.util.Date date_util = new java.util.Date();
//Tu fais tes traitement sur date_util...

//Tu castes à la fin pour insérer en base.
                java.sql.Date date_sql = new java.sql.Date(date_util.getTime());


                System.out.println(date_sql);
/*

String pattern = "MM/dd/yyyy HH:mm:ss";

// Create an instance of SimpleDateFormat used for formatting
// the string representation of date according to the chosen pattern
                DateFormat df = new SimpleDateFormat(pattern);

// Get the today date using Calendar object.
                Date today = (Date) Calendar.getInstance().getTime();
// Using DateFormat format method we can create a string
// representation of a date with the defined format.
                String todayAsString = df.format(today);*/

// Print the result!
              /*  System.out.println("Today is: " + todayAsString);*/
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
