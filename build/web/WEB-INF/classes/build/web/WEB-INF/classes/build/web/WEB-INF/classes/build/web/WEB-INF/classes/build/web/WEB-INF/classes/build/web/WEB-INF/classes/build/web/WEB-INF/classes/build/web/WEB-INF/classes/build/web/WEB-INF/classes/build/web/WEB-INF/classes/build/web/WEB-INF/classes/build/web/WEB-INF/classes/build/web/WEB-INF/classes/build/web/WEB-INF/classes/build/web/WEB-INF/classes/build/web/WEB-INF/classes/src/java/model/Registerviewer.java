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

/**
 *
 * @author anubh
 */
public class Registerviewer { 
     public boolean isRegister(String username,String password,String GmailId,String Address) 
    {
         
        
  // String tablePassword=""; 
       try  
       { 
           int i=0;
                      Statement st = DBcollector.getStatement();
                     String query = "INSERT INTO emp  VALUES ('"+username+"','"+password+"','"+GmailId+"','"+Address+"')";  
                      i = st.executeUpdate(query); 
          
           if(i>0) 
           {
               return true;
           }    
       
    }
       catch(SQLException e) 
       {
           System.out.println(e);
       }   
       
             return false;
    }
}
       
       
            
    
     
    
     
  
        

