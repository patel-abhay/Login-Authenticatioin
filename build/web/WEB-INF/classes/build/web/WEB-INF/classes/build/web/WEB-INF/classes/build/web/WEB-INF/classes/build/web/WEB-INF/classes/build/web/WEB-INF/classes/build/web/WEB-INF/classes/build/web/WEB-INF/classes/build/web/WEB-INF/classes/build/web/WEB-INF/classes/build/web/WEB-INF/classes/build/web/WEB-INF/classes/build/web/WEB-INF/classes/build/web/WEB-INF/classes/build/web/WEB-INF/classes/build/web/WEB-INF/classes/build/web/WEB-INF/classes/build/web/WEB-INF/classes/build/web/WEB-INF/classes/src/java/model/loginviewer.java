/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBcollector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;


/**
 *
 * @author anubh
 */
public class loginviewer 
{ 
    
    public boolean isLogin(String username,String password) 
    {
   String Password1=""; 
       try  
       {
           Statement st = DBcollector.getStatement();
           String query = "SELECT  from emp where username='"+username+"'"; 
           ResultSet rs = st.executeQuery(query);                                   
          
           if(rs.next()) 
           {
               Password1 = rs.getString("password"); 
              
           }  
           else 
           {
               return false;
           }
       } 
       catch(SQLException e) 
       {
           System.out.println(e);
       }
       
     
    if(password.equals(Password1))
       { 
           return true;
       } 
         return false;
    }     
}
       
    

