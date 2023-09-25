package com.example.demoDB1;

import java.sql.*;

public class DemoClass {
  public static void main(String[] args) {
    try {
      String url = "jdbc:mysql://localhost:3306/test";
      String uname = "root";
      String pass = "root";
      String query = "select userName from student where userid=3";

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url, uname, pass);
      Statement st = conn.createStatement();
      ResultSet result = st.executeQuery(query);

      result.next();
      String name = result.getString("userName");
      System.out.println(name);

      st.close();
      conn.close();

    } catch (ClassNotFoundException | SQLException e) {
      System.out.println(e.getMessage());
    }
  }

}
