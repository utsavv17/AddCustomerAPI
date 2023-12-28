/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import controller.*;
import model.Customer;  // Replace "path.to.your" with the actual package path

/**
 *
 * @author 91789
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
    private static final String JDBC_URL = "jdbc:mysql://your-database-url:3306/your-database-name";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    private static final String INSERT_Customer_QUERY = "INSERT INTO customer (CustomerID, CustomerName, Email, MoblieNumber, City) VALUES (?, ?, ?, ?, ?)";

    public Customer CreateCustomer(Customer customer) {
         try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_Customer_QUERY)) {
            System.out.println("CustomerDao");
            preparedStatement.setInt(1, customer.getCustomerID());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getEmail());
          preparedStatement.setString(4, customer.getMobileNumber());
   preparedStatement.setString(5, customer.getCity());

            preparedStatement.executeUpdate();
         }
         catch (SQLException e) {
            // Handle exceptions appropriately (e.g., log or throw a custom exception)
            e.printStackTrace();
        }

        return null; // Return null if no customer found or an error occurred
    }
}

