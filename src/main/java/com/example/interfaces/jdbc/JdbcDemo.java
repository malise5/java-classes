package com.example.interfaces.jdbc;

import java.sql.ResultSet;

public class JdbcDemo {
  public static void main(String[] args) {
    DataAccess mysql = new MysqlDataAccess();

    mysql.connect();
    ResultSet user = mysql.executeQuery("SELECT * FROM test");
    mysql.close();
  }
}
