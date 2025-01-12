/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.VotingCertifier;

/**
 *
 * @author anubh
 */
public class VotingChecker extends HttpServlet {

   
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  
    { 
         response.sendRedirect("Online voting.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        VotingCertifier iv = new VotingCertifier();
       boolean Login = iv.IsVoter(username,password); 
        Object tablePassword = null;
       if(password.equals(tablePassword)) 
       {
            response.sendRedirect("Online voting.html");
       }
      
     else if(Login) 
      {
         
          HttpSession session = request.getSession(true);
           session.setAttribute("username", username);
           response.sendRedirect("VotingPage.html"); 
       } 
       else
       {
           response.sendRedirect("Online voting.html");
       }
     
    }
}
