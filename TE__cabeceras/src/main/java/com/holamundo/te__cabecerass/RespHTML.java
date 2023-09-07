
package com.holamundo.te__cabecerass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/HTML");
        PrintWriter out = response.getWriter();
        try{
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta HTML</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HTML Generado desde un Servlet</h1>");
            out.println("<h2>Estudiante: Apaza Huacani Jhon Felix</h2>");
            out.println("<h2>EMERGENTE 2</h2>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
        
    }
}
