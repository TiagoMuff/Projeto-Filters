package br.com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletDecide extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String n = (String) session.getAttribute("name");

        if (n.equals("Tiago") && request.getParameter("btnT") != null) {
            response.sendRedirect("Tiago.jsp");

        } else if (n.equals("Coelho") && request.getParameter("btnC") != null) {
            response.sendRedirect("Coelho.jsp");

        } else {
            response.sendRedirect("AcessoNegado.jsp");
        }

    }

}
