package ncpproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ncpproject.model.employee;

public class adminMessages {

    public String adminMessage() throws ClassNotFoundException {
        String INSERT_USERS_SQL = "SELECT * FROM adminmessage"; 

        ResultSet result;
        String value="";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/ncp", "root", "qwertyuiop@123");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
//            preparedStatement.setInt(1, 1);
            
            

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeQuery();
            
            value=value+"<html><head> <meta charset=\"ISO-8859-1\"> <title>Admin Messages</title> <style type=\"text/css\"> * { margin: 0; padding: 0; font-family: consolas; user-select: none; } body { justify-content: center; align-items: center; background: linear-gradient(270deg, #000000, #e7e7e7, #348f9b); background-size: 600% 600%; animation: changeBackground 30s ease infinite; /* animation-duration,animation-timing-function-cubic bezier,animation-iteration-count */ } @keyframes changeBackground { 0% { background-position: 0% 50%; } 50% { background-position: 100% 50%; } 100% { background-position: 0% 50%; } } table { margin: 6%; border-radius: 10px; background-color: #f2f2f2; padding: 10px; } .age:invalid, .name:invalid { border-radius: 10px; background-color: red; } </style> </head><body><table style='border: 1px solid black;'><tr><td>Ticket ID</td><td></td><td>Subject</td><td></td><td>Message</td></tr>";
            while(result.next()) {
            	value=value+"<tr><td>"+result.getString(1)+"</td><td></td><td>"+result.getString(2)+"</td><td></td><td>"+result.getString(3)+"</td><td></td></tr>";
            }
            value=value+"</table></body></html>";
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return value;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}