/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RAJEEV
 */
public class Connector {
    public Connection con=null;
    Statement st=null;
    
   public Connector()
   {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/profile", "root", "");
       }catch(Exception e){
           System.out.println(e.getMessage());}
   }
   public ResultSet executeq(String q)
   {
       ResultSet rs=null;
       try{
           st=con.createStatement();
           rs=st.executeQuery(q);
       }catch(Exception e){
           System.out.println(e.getMessage());}
       return rs;
   }
   public int executeu(String q)
   {
       int aa=0;
       try{
           st=con.createStatement();
           aa=st.executeUpdate(q);
       }catch(Exception e){
           System.out.println(e.getMessage());}
       return aa;
   }
    
}
