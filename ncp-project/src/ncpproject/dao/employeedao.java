package ncpproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ncpproject.model.employee;

public class employeedao {

    public int registerEmployee(employee employee1) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO members" +
            "  ( name, department, designation, age, password,email) VALUES " +
            " (?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/ncp", "root", "qwertyuiop@123");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
//            preparedStatement.setInt(1, 1);
            preparedStatement.setString(1, employee1.getName());
            preparedStatement.setString(2, employee1.getDepartment());
            preparedStatement.setString(3, employee1.getDesignation());
            preparedStatement.setString(4, employee1.getAge());
            preparedStatement.setString(5, "secret123");
            preparedStatement.setString(6, employee1.getEmail());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
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