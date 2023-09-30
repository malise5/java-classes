package com.example.jdbcExample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProject {

  private String url = "jdbc:mysql://127.0.0.1:3306/jdbc_demo";
  private String username = "javauser";
  private String password = "javauser";

  public static void main(String[] args) {
    DatabaseProject project = new DatabaseProject();
    project.createConnection();

  }

  public void createConnection() {

    try {
      // connecting to the database
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url, username, password);
      System.out.println("Dtabase connection successfull");

      // creating query
      Statement statement = conn.createStatement();
      ResultSet rs = statement.executeQuery("SELECT * FROM users;");

      // getting data from database
      while (rs.next()) {
        String name = rs.getString("name");
        System.out.println(name);
      }

    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

  }

}
