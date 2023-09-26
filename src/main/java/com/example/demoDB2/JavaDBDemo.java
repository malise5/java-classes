package com.example.demoDB2;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.logger.CustomFormatter;

public class JavaDBDemo {
  private static final Logger LOGGER = Logger.getLogger(JavaDBDemo.class.getName());

  public static void main(String[] args) {
    // using scanner for inputs
    Scanner scanner = new Scanner(System.in);

    FileHandler fh;
    try {

      fh = new FileHandler("WorkingDatabase.txt");
      CustomFormatter formatter = new CustomFormatter();
      LOGGER.addHandler(fh);
      fh.setFormatter(formatter);

      /**
       * Connecting to the Database
       */
      // 1.Add the jdbc driver to pom.xml
      // 2. Load Database Driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      // Setting the credentials
      String url = "jdbc:mysql://127.0.0.1:3306/javadb";
      String username = "javauser";
      String password = "javauser";

      // 3. Create a Connection to the Database
      Connection connection = DriverManager.getConnection(url, username, password);

      // 4.Create statement from the connection
      Statement statement = connection.createStatement();
      // line to execute
      String createStudentTable = "CREATE TABLE IF NOT EXISTS students (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(50) NOT NULL,age INT)ENGINE=INNODB;";

      // 5 Execute sql Queries or Updates
      // creating the table
      int updateStatus = statement.executeUpdate(createStudentTable);
      LOGGER.info("updateStatus = " + updateStatus + "\n");

      // Execute insert values into respective table without dynamic data
      // String insertQuery = "INSERT INTO students (name, age)VALUES ('John Doe',
      // 20);";
      // int numberOfRowsInserted = statement.executeUpdate(insertQuery);
      // LOGGER.info("NumberOfRowsInserted = " + numberOfRowsInserted);

      // ================SCANNER/USER INPUTS====================
      // Execute insert values into respective table with dynamic data using scanner
      String insertQuery = "INSERT INTO students (name, age)VALUES (?, ?);";
      PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

      // ? reading Inputs from console of values = name, age
      Student student = getStudentsDetails(scanner);

      // set the values of the students => ? ?
      preparedStatement.setString(1, student.getName());
      preparedStatement.setInt(2, student.getAge());
      int numberOfRows = preparedStatement.executeUpdate();
      LOGGER.info("NumberOfRowsInserted = " + numberOfRows + "\n");

      // Execute Selection
      String selectQuery = "SELECT * FROM students;";
      ResultSet results = statement.executeQuery(selectQuery);

      // iterate
      while (results.next()) {
        // id ,name,age
        int id = results.getInt("id");
        String name = results.getString("name");
        int age = results.getInt("age");

        Student dbStudent = new Student(id, name, age);
        System.out.println(dbStudent);
      }

      // closing the resources
      results.close();
      preparedStatement.close();
      statement.close();
      connection.close();

    } catch (SecurityException e) {
      System.out.println("Unable to obtain security permission for the log file " + e.getMessage());
    } catch (IOException e) {
      LOGGER.severe("Unable to read/Write permission for the log file " + e.getMessage() + "\n");
      ;
    } catch (ClassNotFoundException e) {
      LOGGER.severe("Unable to obtain class for jdbc driver, add it To the pom.xml " + e.getMessage());
    } catch (SQLException e) {
      LOGGER.severe("Database operation failure" + e.getMessage() + "\n");
    }

  }

  // ? Methods that takes in Students details
  private static Student getStudentsDetails(Scanner scanner) {
    System.out.print("Enter Student's  name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Student's Age: ");
    // int age = scanner.nextInt();
    // scanner.nextLine();
    int age = Integer.parseInt(scanner.nextLine());

    Student student = new Student(name, age);
    return student;
  }

}
