package jdbc_17441;

import java.util.*;
import java.sql.*;
public class Hola {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Email");
    String name = sc.nextLine();
    System.out.println("Enter your password");
    String password = sc.nextLine();
    
    String query = "insert into user values('"+name+"','"+password+"')";
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con = DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/item","root","qwertyuiop@123");  
    Statement st = con.createStatement();
    int res = st.executeUpdate(query);
    
    if(res == 1)
    {
      System.out.println("Successful Execution.");
    }
    
    else
    {
      System.out.println("Execution Failed.");
    }
    
    st.close();
    con.close();
  }

}