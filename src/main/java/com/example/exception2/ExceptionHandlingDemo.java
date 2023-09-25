package com.example.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {

    ExceptionHandlingDemo app = new ExceptionHandlingDemo();

    app.workingWithBasicException();
    app.workingWithExcept();
  }

  private Student readStudentDetails() {
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Enter Your Details here: ");

      String name = scanner.next();
      student.setName(name);

      String regNo = scanner.next();
      student.setRegNo(regNo);

      String email = scanner.next();
      student.setEmail(email);

      System.out.println("Enter Your Age here: ");
      int age = scanner.nextInt();

      // student.toString();

    } catch (InputMismatchException e) {
      System.out.println("The input is invalid: " + e.getMessage());
    } finally {
      System.out.println("Released resources");
      scanner.close();
    }
    return student;
  }

  private void workingWithExcept() {
    StudentController studentController = new StudentController();

    try {
      studentController.addStudent(readStudentDetails());
    } catch (StudentDetailsExceptions e) {
      System.out.println(e.getMessage());
    } finally {
      studentController = null;
      System.out.println("Grabage collected");
    }

  }

  private void workingWithBasicException() {
    Calculator calculator = new Calculator();
    try {
      double result = calculator.divide(6, 0);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(calculator.sum(0, 0));
    } catch (MyCustomException e) {
      System.out.println(e.getMessage());
    }
  }
}
