package com.example.interfaces.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDataAccess implements DataAccess {

  public MysqlDataAccess() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public Connection connect() {
    try {
      Connection connection = DriverManager.getConnection(
          "url",
          "username",
          "password");
      return connection;
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return null;
    }
  }

  @Override
  public ResultSet executeQuery(String query) {
    try {
      Statement statement = connect().createStatement();
      ResultSet resultSet = statement.executeQuery(query);
      return resultSet;
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return null;
    }
  }

  @Override
  public int executeUpdate(String query) {
    try {
      Statement statement = connect().createStatement();
      int numberOfRecords = statement.executeUpdate(query);
      return numberOfRecords;
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return 0;
    }
  }

  @Override
  public void close() {

  }

}
