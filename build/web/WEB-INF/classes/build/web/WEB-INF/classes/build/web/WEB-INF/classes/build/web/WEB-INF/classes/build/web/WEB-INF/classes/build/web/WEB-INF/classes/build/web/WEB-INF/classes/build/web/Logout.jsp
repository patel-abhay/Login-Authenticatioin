<%-- 
    Document   : Logout
    Created on : 6 Jun, 2023, 12:43:37 PM
    Author     : anubh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout page</title>
    </head>
    <body>
        <%      
                session.invalidate();
                response.sendRedirect("login.html");

            %>
    </body>
</html>
