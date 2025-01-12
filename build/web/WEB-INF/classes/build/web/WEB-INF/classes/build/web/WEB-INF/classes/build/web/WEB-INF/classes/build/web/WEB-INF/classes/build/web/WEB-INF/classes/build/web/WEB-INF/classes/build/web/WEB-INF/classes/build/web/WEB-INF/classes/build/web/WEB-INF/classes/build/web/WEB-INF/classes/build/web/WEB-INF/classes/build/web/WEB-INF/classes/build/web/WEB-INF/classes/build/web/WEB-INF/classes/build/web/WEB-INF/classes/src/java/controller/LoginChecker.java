/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.loginviewer;
import org.apache.tomcat.jni.Address;

/**
 *
 * @author anubh
 */
public class LoginChecker extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null) 
        {
            loginviewer lv = new loginviewer();
            boolean Login = lv.isLogin(username, password);
            if (Login) 
            {  
                
                response.sendRedirect("home.jsp");
               // HttpSession session = request.getSession(true);
               // session.setAttribute("username", username);
               // session.setAttribute("password", password);
               // RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
               // rd.forward(request, response);
            }
        } 
        else {
            response.sendRedirect("login.html");
        }
    }
}
