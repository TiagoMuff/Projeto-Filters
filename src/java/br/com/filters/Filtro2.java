package br.com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Filtro2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        /*conversão request*/
        HttpServletRequest conversaoreq = (HttpServletRequest) request;
        HttpSession session = conversaoreq.getSession();

        String n = session.getAttribute("name").toString();

        if (n.equals("Tiago") || n.equals("Coelho")) {

            chain.doFilter(request, response);

        } else {
            ((HttpServletResponse) response).sendRedirect("Index.jsp");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
