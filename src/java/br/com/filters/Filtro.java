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

public class Filtro implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //throw new UnsupportedOperationException("Not supported yet.");

        /*conversão request*/
        HttpServletRequest conversaoreq = (HttpServletRequest) request;
        String n = conversaoreq.getParameter("nome");
        String s = conversaoreq.getParameter("senha");

        if (n.equals("Tiago")
                && s.equals("123")) {
            //USANDO NÃO PRECISA DO SERVLET   
//            HttpSession session = conversaoreq.getSession();
//            String n = request.getParameter("nome");
//            session.setAttribute("name", n);
//            /*conversão response*/
//            ((HttpServletResponse) response).sendRedirect("Wellcome.jsp");
            chain.doFilter(request, response);

        } else if (n.equals("Coelho")
                && s.equals("321")) {
            chain.doFilter(request, response);

        } else {
            ((HttpServletResponse) response).sendRedirect("Index.jsp");
        }

    }

    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}
