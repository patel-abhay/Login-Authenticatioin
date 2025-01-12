<%-- 
    Document   : Register
    Created on : 9 Jun, 2023, 11:47:10 AM
    Author     : anubh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body bgcolor="cyan">  
        <a href="Logout.jsp">Sing Out</a> 
        <% 
                String username = (String) session.getAttribute("username"); 
                    if(username==null)
                    {
                        response.sendRedirect("Registrationform.html");
                    }
        %>
       <H1>hello<%=username%></H1>
        <H2>Register successful..</H2>
    </body>
</html>
