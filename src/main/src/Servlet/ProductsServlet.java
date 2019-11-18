package Servlet;

import Models.Products;
import Utils.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;

@WebServlet(name = "ProductsServlet")
public class ProductsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Products myproduct = new Products();
        String name = request.getParameter("name");
        Integer rate = Integer.valueOf(request.getParameter("rate"));
        Integer cap = Integer.valueOf(request.getParameter("cap"));
        Integer duration = Integer.valueOf(request.getParameter("duration"));
        Integer age_min_prefered = Integer.valueOf(request.getParameter("age_min_preferred"));
        Integer age_max_preferred = Integer.valueOf(request.getParameter("age_max_preferred"));
        Integer age_min_required = Integer.valueOf(request.getParameter("age_min_required"));
        Integer age_max_required = Integer.valueOf(request.getParameter("age_max_required"));
        Integer income_min_preferred = Integer.valueOf(request.getParameter("income_min_preferred"));
        Integer income_max_preferred = Integer.valueOf(request.getParameter("income_max_preferred"));
        Integer income_min_required = Integer.valueOf(request.getParameter("income_min_required"));
        Integer income_max_required = Integer.valueOf(request.getParameter("income_max_required"));
        String professionnal_situation_preferred = request.getParameter("professionnal_situation_preferred");
        String familial_situation_preferred = request.getParameter("familial_situation_preferred");


        myproduct
                .setName(name)
                .setRate(rate)
                .setCap(cap)
                .setDuration(duration)
                .setAge_min_preferred(age_min_prefered)
                .setAge_max_preferred(age_max_preferred)
                .setAge_min_required(age_min_required)
                .setAge_max_required(age_max_required)
                .setIncome_min_preferred(income_min_preferred)
                .setIncome_max_preferred(income_max_preferred)
                .setIncome_min_required(income_min_required)
                .setIncome_max_required(income_max_required)
                .setProfessionnal_situation_preferred(professionnal_situation_preferred)
                .setCreated_at(Timestamp.valueOf(LocalDateTime.now()))
                .setUpdated_at(null)
                .setFamilial_situation_preferred(familial_situation_preferred)
                ;

        Database.insert(myproduct);

        response.sendRedirect(request.getContextPath()+"/addproducts");



    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap map = new HashMap();
        map.put("chomeur", "Demandeur emploi");
        map.put("activité", "Sans Activités");
        map.put("employé", "Employé");
        map.put("intermediaire", "Intermediaire");
        map.put("supérieure", "Supérieur");

        request.setAttribute("professionnal_situation_preferred", map);

        HashMap map2 = new HashMap();
        map.put("marié", "Marié");
        map.put("pacsé", "Pacsé");
        map.put("divorcé", "Divorcé");
        map.put("séparé", "Séparé");
        map.put("célibataire", "Célibataire");
        map.put("veuf", "Veuf");

        request.setAttribute("familial_situation_preferred", map2);

        request.getRequestDispatcher("addproducts.jsp").forward(request, response);
    }
}
