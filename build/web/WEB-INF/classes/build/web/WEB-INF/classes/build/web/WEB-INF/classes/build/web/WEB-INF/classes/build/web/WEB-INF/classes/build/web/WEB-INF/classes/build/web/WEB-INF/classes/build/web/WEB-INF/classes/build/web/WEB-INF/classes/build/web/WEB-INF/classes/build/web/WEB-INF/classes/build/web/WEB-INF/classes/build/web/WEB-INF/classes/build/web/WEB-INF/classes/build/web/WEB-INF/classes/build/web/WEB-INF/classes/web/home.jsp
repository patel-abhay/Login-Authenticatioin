<%-- 
    Document   : home
    Created on : 5 Jun, 2023, 11:29:07 PM
    Author     : anubh
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBcollector"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home Page</title> 
        <%  String username = "", password = "", GmailId = "", Address = "";

            Statement st = DBcollector.getStatement();
            try {
                String query = "SELECT * from emp";
                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    username = rs.getString("username");
                    password = rs.getString("password");
                    GmailId = rs.getString(" GmailId");
                    Address = rs.getString("Address");

                    session.setAttribute("username", username);
                    session.setAttribute("password", password);
                    session.setAttribute(" GmailId", GmailId);
                    session.setAttribute(" Address", Address);

                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            /* String contact = (String) session.getAttribute("contact"); 
                  if(username==null)
                     {
                         response.sendRedirect("login.html");
                     }*/
        %>
    </head>
    <body bgcolor="000000">   
        <div style="background:#00DBFF;width:90%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 60px;">

            <a href="Logout.jsp">Sing Out</a> 

            <H1><%=username%> Your Profile</H1>

            <form action="" method="post" >
                <table >  
                    <tr> 

                        <td><Strong>Name:&nbsp;   <textarea name="username"row="1"   width:="50%"><%=username%></textarea></Strong></td> 
                    </tr> 
                    <tr>
                        <td><Strong>Password:&nbsp;   <textarea name="password"row="1"><%=password%></textarea></Strong></td> 
                    </tr>
                    <tr> 
                        <td><Strong>Gmail I'D:&nbsp;  <textarea name="GmailID"row="1"><%=GmailId%></textarea></Strong></td> 
                    </tr> 
                    <tr> 
                        <td><Strong>Address:&nbsp;   <textarea name="Address"row="1"><%=Address%></textarea></Strong></td> 
                    </tr>  
                    <tr>
                        <td><Strong></Strong></td>
                        <td><Strong> <div style=" background: #001e4d; color: #fff;font-weight: 500; width: 60px;  border:0;  padding: 10px; margin: 10px auto 0; display: block;border-radius: 2px;cursor: pointer; 
                           transition: all 0.3s;"><INPUT type = "submit" value="Update"/> </div>
                            </Strong></td> 
                    </tr>
                </table> 
            </form> 
        </div>
    </body>
</html>

</body>
</html>
