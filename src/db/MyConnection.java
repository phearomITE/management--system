
package db;

import java.sql.DriverManager;
import java.sql.Connection;
public class MyConnection {
    
    private static final String username ="root";
    private static final String password ="200501&2@";
     private static final String dataConn ="jdbc:mysql://localhost:3306/student_test";
     
     private static Connection con = null;
     
     public static Connection getConnection(){
     
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(dataConn,username,password);
      } catch (Exception ex){
        System.out.print(ex.getMessage());
      }
      return con;
     }
    
}
