<%-- 
    Document   : Registraionform
    Created on : 7 Jun, 2023, 11:38:01 PM
    Author     : anubh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
    </head>
    <body bgcolor="cyan">
       <H1> Welcome User...</H1> 
        <form >
        <table action="" method="post"  bgcolor="7FFFD4" >  
            <tr> 
                <td><Strong>User name</Strong></td>
                <td><Strong><INPUT type = "text" name="username" placeholder="Enter your user name"/></Strong></td> 
            </tr> 
            <tr>
                <td><Strong>Password</Strong></td>
                <td><Strong><INPUT type = "password" name="password" placeholder="Enter your password"/></Strong></td> 
            </tr>
             <tr>
                <td><Strong> Confirm Password</Strong></td>
                <td><Strong><INPUT type = "password" name="confirm password" placeholder="Enter your confirm password" size="22"/></Strong></td> 
            </tr> 
              
            <tr> 
                <td><Strong> Gmail I'D</Strong></td>
                <td><Strong><INPUT type = "text" name="gmail I'd" placeholder="Enter your Gmail I'd"/></Strong></td> 
            </tr> 
             <tr> 
                <td><Strong> Contract No.</Strong></td>
                <td><Strong><INPUT type = "text" name="Contract No."  value = "+91" size="15"/></Strong></td> 
            </tr>  
            <tr> 
                <td><Strong> Address</Strong></td>
                <td><Strong><INPUT type = "text" name=" Address"/>  </Strong></td> 
            </tr>  
            <tr>
                <td><Strong></Strong></td>
                <td><Strong><INPUT type = "submit" value="Register"/>   <INPUT type = "reset" value="Reset"/></Strong></td> 
            </tr>
        </table> 
            </form>
    </body>
</html>
