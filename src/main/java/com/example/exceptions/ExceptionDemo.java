package com.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

  public static void main(String[] args) {
    ExceptionDemo app = new ExceptionDemo();

    app.workingWithException();

    app.scannerInput();
  }

  private Student scannerInput() {
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Enter Your Details: ");
      String name = scanner.next();
      student.setName(name);

      String regNo = scanner.next();
      student.setRegNo(regNo);

      String email = scanner.next();
      student.setEmail(email);

    } catch (InputMismatchException e) {
      System.out.println("Input error: ");
    } finally {
      scanner.close();
      System.out.println("Released resources");
    }

    return student;
  }

  private void workingWithException() {
    StudentController studentController = new StudentController();
    try {
      studentController.addStudent(scannerInput());
    } catch (MissingException e) {
      System.out.println(e.getMessage());
    } finally {
      studentController = null;
      System.out.println("Garbage collected");
    }
  }

}
