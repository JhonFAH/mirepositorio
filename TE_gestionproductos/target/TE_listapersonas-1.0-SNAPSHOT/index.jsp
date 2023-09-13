<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.te_listapersonas.Persona"%>
<%
    
    if (session.getAttribute("listaper")==null){
        ArrayList<Persona> lisaux=new ArrayList<Persona>();
        session.setAttribute("listaper",lisaux);
    }
    ArrayList<Persona> lista = (ArrayList<Persona>) session.getAttribute("listaper");

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>SEGUNDO PARCIAL TEM-742</h3>
        <h3>Nombre .- Apaza Huacani Jhon Felix</h3>
        <h3>Carnet .- 7099541</h3>
        <h1>GESTION DE PRODUCTOS</h1>
        <a href="MainServlet?op=nuevo">Nuevo producto</a>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Descripcion</th>
                <th>Cantidad</th>
                <th>Precio</th>
                <th>Categoria</th>
                <th></th>
                <th></th>
                
            </tr>
            <%
            if(lista!=null){
                for(Persona item:lista){
                
           
            %>
            
            
            <tr>
                <td> <%= item.getId()%> </td>
                <td><%= item.getDescripcion()%> </td>
                <td> <%=item.getCantidad() %> </td>
                <td> <%=item.getPrecio()%> </td>
                <td> <%=item.getCategoria()%> </td>
                <td> 
                    <a href="MainServlet?op=editar&id=<%= item.getId()%>">Editar</a>
                
                </td>
                <td>  
                
                    <a href="MainServlet?op=eliminar&id=<%=item.getId()%>"
                       onclick="return(confirm("Esta seguro de eliminar?????"))"
                       >Eliminar</a>
                    
                
                
                </td>
            </tr>
            <%
                }
            }
            %>
            
        </table>    
    </body>
</html>
