package com.example.javaprojects.studentdatabaseapplication;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String StudentId;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int costOfCourse = 600;
  private static int id = 100;
  Scanner scanner = new Scanner(System.in);

  // Cinstructor: prompt yser to enter students name and year
  public Student() {
    System.out.print("Enter student firstname: ");
    this.firstName = scanner.nextLine();

    System.out.print("Enter student lastname: ");
    this.lastName = scanner.nextLine();

    System.out.println();
    System.out.println("1. Freshmen");
    System.out.println("2. Sophhmore");
    System.out.println("3. Junior");
    System.out.println("4. Senior");
    System.out.println();
    System.out.print("Enter student Grade Level: ");
    this.gradeYear = Integer.parseInt(scanner.nextLine());

    setStudentId();

    System.out.println("Name: " + firstName + " " + lastName + "\nGrade: " + gradeYear + "\nStudentId: " + StudentId);

  }

  // generate id
  private void setStudentId() {
    // incremenet id
    id++;
    // Grade level + static id
    this.StudentId = "" + gradeYear + "/" + id;
  }

  // enroll in course
  public void enroll() {
    // get inside a loop user hits 0

    do {
      System.out.print("Enter course Enoll (press: Q to quit): ");
      String course = scanner.nextLine();
      if (!course.equalsIgnoreCase("Q")) {
        courses = courses + "\n " + course;
        tuitionBalance = tuitionBalance + costOfCourse;
      } else {
        break;
      }
    } while (1 != 0);
    // System.out.println(
    // "========== Course Entrolled: =======" + "\n " + courses);
  }

  // view balance
  public void viewbalance() {
    System.out.println("Your balance is: " + tuitionBalance);
  }

  // pat tuition
  public void payTuition() {
    viewbalance();
    System.out.print("Enter amount to pay: $");
    int payment = Integer.parseInt(scanner.nextLine());
    tuitionBalance = tuitionBalance - payment;
    System.out.println("Thank you for your payment of $" + payment);
    viewbalance();
  }

  @Override
  public String toString() {
    System.out.println();
    return "Student Information :\n firstName : " + firstName + "\n lastName : " + lastName + "\n gradeYear : "
        + gradeYear + "\n StudentId : "
        + StudentId + "\ncourses Enrolled : " + "\n " + courses + "\ntuitionBalance : " + tuitionBalance + "$";

  }

  // // show info
  // public void studentInformation() {
  // System.out.println();
  // System.out.println("============ Student Information ============:");
  // System.out.println("First and Lastname: " + firstName + " " + lastName);
  // System.out.println("grade Year : " + gradeYear);
  // System.out.println("StudentId : " + StudentId);
  // System.out.println("courses Enrolled: " + courses);
  // System.out.println("TuitionBalance: " + tuitionBalance + "$");
  // }

}
