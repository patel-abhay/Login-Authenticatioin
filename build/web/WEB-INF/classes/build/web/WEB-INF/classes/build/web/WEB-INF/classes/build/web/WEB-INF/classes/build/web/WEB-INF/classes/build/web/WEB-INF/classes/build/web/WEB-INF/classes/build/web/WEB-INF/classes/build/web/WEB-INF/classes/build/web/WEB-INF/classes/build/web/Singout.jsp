<%-- 
    Document   : Singout
    Created on : 17 Jun, 2023, 12:31:56 AM
    Author     : anubh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sing out Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("Online Voting.html");

        %>
    </body>
</html>
