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
public class VotingCertifier
{ 
     public boolean IsVoter(String username,String password) 
    {
      String tablePassword=""; 
       try  
       {
           Statement st = DBcollector.getStatement();
           String query = "INSERT INTO votingtable VALUES ('"+username+"','"+password+"')";  
          int i = st.executeUpdate(query);     
          ResultSet rs = st.executeQuery(query); 
           if(rs.next()) 
           {
               tablePassword = rs.getString("password");
           }  
           if(i>0) 
           {
                return true;
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
          
         return false;
    }

}
