
package com.holamundo.te__cabecerass;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	    response.setContentType("application/csv");
            response.setHeader("Content-Disposition","attachment;filename=archivo.csv");
            PrintWriter out = response.getWriter();
            try{
                /* TODO output your page here. You may use following sample code. */
                out.println("id;nombre;apellidos;edad");
                out.println("1;Jhon;Apaza Huacani;25");
                out.println("2;Bruno;Diaz;18");
                out.println("3;Armando;Mesa;30");            
                
            }finally{
                out.close();
            }
    }
}
