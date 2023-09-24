package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseAccessDemo {

  public static void main(String[] args) {

    try {
      // 1. Add jdbc driver to the pom.xml
      // 2. Load the database driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      // 3. Create a connection to the database
      String connectionUrl = "jdbc:mysql://localhost:3308/intro";
      String user = "kudez";
      String password = "123456";
      Connection connection = DriverManager.getConnection(connectionUrl, user, password);
      // 4.Create a statement
      Statement statement = connection.createStatement();

    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (SQLException e) {
      System.out.println("Unable to connect to the Database: " + e.getMessage());
    }

  }

}