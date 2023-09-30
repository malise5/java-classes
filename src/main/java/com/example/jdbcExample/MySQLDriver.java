package com.example.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDriver {
  public static void main(String[] args) {
    String connectionUrl = "jdbc:mysql://localhost:3306/jdbc_demo";
    String user = "javauser";
    String password = "javauser";

    // try-with-resource statement to close resources automatically
    try (
        // 1.Establish connection
        Connection connection = DriverManager.getConnection(connectionUrl, user, password);

        // 2. create a statement
        Statement statement = connection.createStatement();

        // 3.execute statement
        ResultSet rs = statement.executeQuery("SELECT * FROM users");)
    // boolean result = statement.execute(createTable);
    {

      // 4. process result
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        String country = rs.getString("country");
        String pass = rs.getString("password");

        System.out.println(
            "Id: " + id + ", Name: " + name + ", Email: " + email + ", Country: " + country + ", Password: " + pass);
      }

    } catch (SQLException e) {
      e.getMessage();
    }

  }
}
