package com.example.javaprojects.studentdatabaseapplication;

import java.util.Scanner;

public class StudentDatabaseApp {
  public static void main(String[] args) {
    // Student std1 = new Student();
    // std1.enroll();
    // // std1.viewbalance();
    // std1.payTuition();
    // std1.studentInformation();

    // ask how many new users we want to add
    System.out.println("Enter number of students to Enroll: ");
    Scanner scanner = new Scanner(System.in);
    int numberOfStudents = Integer.parseInt(scanner.nextLine());

    Student[] students = new Student[numberOfStudents];

    // ..create a number od students
    for (int i = 0; i < students.length; i++) {

      students[i] = new Student();
      students[i].enroll();
      students[i].payTuition();
      // students[i].studentInformation();
      System.out.println(students[i].toString());
    }
  }
}
