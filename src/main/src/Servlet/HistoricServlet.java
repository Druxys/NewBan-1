package Servlet;

import Models.Historics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HistoricServlet")
public class HistoricServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String resume = request.getParameter("resume");
        String type_contact = request.getParameter("type_contact");
        String contact_taken = request.getParameter("contact_taken");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Historics myhistoric = new Historics();
        List<Historics> hist = new ArrayList<>();

        System.out.println(hist);

        HttpSession session1 = request.getSession(true);
        String role = (String) session1.getAttribute("role");
        if (role != null){
            System.out.println(role);
            request.getRequestDispatcher("historic.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath()+"/connexion");
        }
    }
}
