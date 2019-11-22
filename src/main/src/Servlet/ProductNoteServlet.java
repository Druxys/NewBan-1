package Servlet;

import Models.Customer_product;
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
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

@WebServlet(name = "ProductNoteServlet")
public class ProductNoteServlet extends HttpServlet {


    public Integer findAge (String birthday) {
        String[] values = birthday.split("-", 0);
        LocalDate birthdate = LocalDate.of(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
        LocalDate actualDate = LocalDate.now();
        Period difference = Period.between(birthdate, actualDate);
        return difference.getYears();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {



    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Products myProduct = new Products();
        Customers myCustomer = new Customers();
        Customer_product myCustomerProduct = new Customer_product();



        ArrayList<String> fields = new ArrayList<>();
        fields.add("*");
        System.out.println(fields);



        List<Customer_product> customerProduct = Database.select(myCustomerProduct, fields);
        List<Products> test = Database.select(myProduct, fields);
        List<Customers> customersList = Database.select(myCustomer, fields );


        ArrayList notes = new ArrayList();
        ArrayList idProduits = new ArrayList();
        ArrayList idClients = new ArrayList();


        for (Customer_product customer_product : customerProduct){
           Integer id = customer_product.getId();
           Database.remove(myCustomerProduct , id);

        }

        for (Products product : test) {


            Integer age_min_prefered = product.getAge_min_preferred();
            Integer age_max_prefered = product.getAge_max_preferred();
            Integer income_min_prefered = product.getAge_max_preferred();
            Integer income_max_prefered = product.getIncome_max_preferred();
            Integer age_min_required = product.getAge_min_required();
            Integer age_max_required = product.getAge_max_required();
            Integer income_min_required = product.getIncome_min_required();
            Integer income_max_required = product.getAge_max_required();
            String proffessionnal_situation_preferred = product.getProfessionnal_situation_preferred();
            String familial_situation_preferred = "celib";

            Integer id_product = product.getId();


            idProduits.add(id_product);




            for (Customers customers : customersList) {

                Integer id_customer = customers.getId();
                idClients.add(id_customer);

                Integer note = 100;
                Integer age = findAge(customers.getBirthdate());
                System.out.println(age);
                Float debt = customers.getDebt();
                Integer income = customers.getIncome();
                String professional_situation = customers.getProfessionnal_situation();
                String familly_situation = customers.getFamilly_situation();
                String contract_type = customers.getContract_type();


                if (age_min_required != null && age_min_required > age) {
                    note = 0;
                } else {
                    if (age_max_required != null && age_max_required < age) {
                        note = 0;
                    } else {
                        if (income_min_required != null && income_min_required > income) {
                            note = 0;
                        } else {
                            if (income_max_required != null && income_max_required < income) {
                                note = 0;
                            } else {
                                if (age_min_prefered !=  null  &&  age_min_prefered >= age ) {
                                    note = note - 10;
                                }
                                if (age_max_prefered !=  null  &&  age_max_prefered <= age ) {
                                    note = note - 10;
                                }
                                if (income_min_prefered !=  null && income_min_prefered >= income ) {
                                    note = note - 10;
                                }
                                if (income_max_prefered !=  null && income_max_prefered <= income ) {
                                    note = note - 10;
                                }
                                if (debt != null && debt >= 0.33) {
                                    note = 0;

                                } else {
                                    if (debt != null) {
                                        Double i;
                                        for (i = 0.0; i <= debt; i = i + 0.05) {
                                            note = note - 5;
                                        }
                                    }
                                    if ( professional_situation != null && professional_situation.equals("salarié")){
                                        if (contract_type != null && contract_type.equals("cdd")){
                                            note = note - 10;
                                        }
                                    }
                                    if (professional_situation != null && !professional_situation.equals(proffessionnal_situation_preferred)){
                                        note = note - 10;
                                    }
                                    if (familly_situation != null && !familly_situation.equals(familial_situation_preferred)){
                                        note = note - 10;
                                    }
                                }
                            }
                        }
                    }
                }



                        myCustomerProduct
                                .setId_product(id_product)
                                .setId_customer(id_customer)
                                .setMark(note)
                                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                                .setUpdated_at(null)
                                .setIs_enabled(true)
                                .setIs_subscribed(false)
                                .setContract_beg(Timestamp.valueOf(LocalDateTime.now()))
                                .setContract_end(Timestamp.valueOf(LocalDateTime.now()))

                        ;
                        Database.insert(myCustomerProduct);
                        notes.add(note);

            }
        }
        System.out.println(idClients);
        System.out.println(idProduits);
        System.out.println(notes);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }

    }

