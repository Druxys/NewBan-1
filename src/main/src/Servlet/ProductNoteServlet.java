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
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "ProductNoteServlet")
public class ProductNoteServlet extends HttpServlet {


    public String findAge(String birthday) {
        String[] values = birthday.split("-", 0);
        return values[2] + "-" + values[1] + "-" + values[0];
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Products myProduct = new Products();
        Customers myCustomer = new Customers();
        ArrayList filters = new ArrayList<>();
        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");
        ArrayList filter = new ArrayList();
        System.out.println(fields);

        List<Products> test = Database.select(myProduct, fields);
        List<Customers> customersList = Database.select(myCustomer, fields);
        ArrayList notes = new ArrayList();
        ArrayList tableau = new ArrayList();
        Integer fe = 0;
        for (Products product : test) {

            Integer note = 100;
            Integer age_min_prefered = 21;
            Integer age_max_prefered = 50;
            Integer income_min_prefered = 6000;
            Integer income_max_prefered = 8000;
            Integer age_min_required = product.getAge_min_required();
            Integer age_max_required = product.getAge_max_required();
            Integer income_min_required = product.getIncome_min_required();
            Integer income_max_required = product.getAge_max_required();
            String proffessionnal_situation_preferred = product.getProfessionnal_situation_preferred();
            String familial_situation_preferred = "celib";
            String nom = product.getName();

            tableau.add(nom);
            fe = fe +1;

            for (Customers customers : customersList) {



                Integer age = 12;
                Double debt = 0.15;
                Integer income = 5000;
                String professional_situation = "salarié";
                String familly_situation = "er";
                String contract_type = "cdd";

                if (age_min_required != null && age_min_required > age) {
                    note = 0;

                } else {
                    System.out.println("0");
                    if (age_max_required != null && age_max_required < age) {
                        note = 0;
                        System.out.println("a");

                    } else {
                        System.out.println("b");
                        if (income_min_required != null && income_min_required > income) {
                            note = 0;

                        } else {
                            System.out.println("c");
                            if (income_max_required != null && income_max_required < income) {
                                note = 0;

                            } else {
                                System.out.println("d");
                                if (age_min_prefered !=  null  &&  age_min_prefered >= age ) {
                                    note = note - 10;
                                    System.out.println("z");

                                }
                                if (age_max_prefered !=  null  &&  age_max_prefered <= age ) {
                                    note = note - 10;
                                    System.out.println("z");

                                }
                                if (income_min_prefered !=  null && income_min_prefered >= income ) {
                                    note = note - 10;
                                    System.out.println("v");
                                }
                                if (income_max_prefered !=  null && income_max_prefered <= income ) {
                                    note = note - 10;
                                    System.out.println("az");
                                }

                                if (debt != null && debt >= 0.33) {
                                    note = 0;
                                    System.out.println("e");
                                } else {
                                    System.out.println("f");
                                    Double i;
                                    for (i = 0.0; i <= debt; i = i + 0.05) {
                                        note = note - 5;
                                        System.out.println("debt");
                                    }
                                    if ( professional_situation != null && professional_situation.equals("salarié")){

                                        System.out.println("salarié");
                                        if (contract_type != null && contract_type.equals("cdd")){

                                            note = note - 10;

                                        }

                                    }

                                    if (familly_situation != null && !familly_situation.equals(familial_situation_preferred)){
                                            note = note - 10;
                                        }





                                }

                            }
                        }
                    }
                }



                    notes.add(note);

            }

        }
        System.out.println(tableau);
        System.out.println(notes);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    }

