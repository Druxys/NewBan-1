package Servlet;

import Models.Products;
import Utils.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;

@WebServlet(name = "ProductsServlet")
public class ProductsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Products myproduct = new Products();
        String name = request.getParameter("name");
//        Integer rate = Integer.valueOf(request.getParameter("rate"));
        Integer rate;
        if (request.getParameter("rate") == ""){
            rate = null;
        } else{
            rate = Integer.valueOf(request.getParameter("rate"));
        }
//        Integer cap = Integer.valueOf(request.getParameter("cap"));
        Integer cap;
        if (request.getParameter("cap") == ""){
            cap = null;
        } else{
            cap = Integer.valueOf(request.getParameter("cap"));
        }
//        Integer duration = Integer.valueOf(request.getParameter("duration"));
        Integer duration;
        if (request.getParameter("duration") == ""){
            duration = null;
        } else{
            duration = Integer.valueOf(request.getParameter("duration"));
        }
//        Integer age_min_prefered = Integer.valueOf(request.getParameter("age_min_preferred"));
        Integer age_min_prefered;
        if (request.getParameter("age_min_prefered") == ""){
            age_min_prefered = null;
        } else{
            age_min_prefered = Integer.valueOf(request.getParameter("age_min_prefered"));
        }
//        Integer age_max_preferred = Integer.valueOf(request.getParameter("age_max_preferred"));
        Integer age_max_preferred;
        if (request.getParameter("age_max_preferred") == ""){
            age_max_preferred = null;
        } else{
            age_max_preferred = Integer.valueOf(request.getParameter("age_max_preferred"));
        }
//        Integer age_min_required = Integer.valueOf(request.getParameter("age_min_required"));
        Integer age_min_required;
        if (request.getParameter("age_min_required") == ""){
            age_min_required = null;
        } else{
            age_min_required = Integer.valueOf(request.getParameter("age_min_required"));
        }
//        Integer age_max_required = Integer.valueOf(request.getParameter("age_max_required"));
        Integer age_max_required;
        if (request.getParameter("age_max_required") == ""){
            age_max_required = null;
        } else{
            age_max_required = Integer.valueOf(request.getParameter("age_max_required"));
        }
//        Integer income_min_preferred = Integer.valueOf(request.getParameter("income_min_preferred"));
        Integer income_min_preferred;
        if (request.getParameter("income_min_preferred") == ""){
            income_min_preferred = null;
        } else{
            income_min_preferred = Integer.valueOf(request.getParameter("income_min_preferred"));
        }
//        Integer income_max_preferred = Integer.valueOf(request.getParameter("income_max_preferred"));
        Integer income_max_preferred;
        if (request.getParameter("income_max_preferred") == ""){
            income_max_preferred = null;
        } else{
            income_max_preferred = Integer.valueOf(request.getParameter("income_max_preferred"));
        }
//        Integer income_min_required = Integer.valueOf(request.getParameter("income_min_required"));
        Integer income_min_required;
        if (request.getParameter("income_min_required") == ""){
            income_min_required = null;
        } else{
            income_min_required = Integer.valueOf(request.getParameter("income_min_required"));
        }
//        Integer income_max_required = Integer.valueOf(request.getParameter("income_max_required"));
        Integer income_max_required;
        if (request.getParameter("income_max_required") == ""){
            income_max_required = null;
        } else{
            income_max_required = Integer.valueOf(request.getParameter("income_max_required"));
        }
        String professionnal_situation_preferred = request.getParameter("psp");
        String familial_situation_preferred = request.getParameter("fsp");


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

        request.setAttribute("psp", map);

        HashMap map2 = new HashMap();
        map2.put("marie", "Marié");
        map2.put("pacse", "Pacsé");
        map2.put("divorce", "Divorcé");
        map2.put("sépare", "Séparé");
        map2.put("célibataire", "Célibataire");
        map2.put("veuf", "Veuf");

        request.setAttribute("fsp", map2);
        System.out.println("bonjour");

        HttpSession session = request.getSession(true);
        String role = (String) session.getAttribute("role");
        if (role != null){
            System.out.println(role);
            request.getRequestDispatcher("addproducts.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath()+"/connexion");
        }
    }
}
