package com.example.generics.arraylist;

import java.util.ArrayList;

public class ArrayList2 {
  public static void main(String[] args) {
    // ArrayList<String> colorList2 = new ArrayList<String>();
    // colorList2.add("Red");
    // colorList2.add("Blue");
    // colorList2.add("Green");
    // colorList2.add("Yellow");
    // System.out.println();
    // System.out.println("==============================================");

    // ArrayList<String> colorList3 = new ArrayList<String>();
    // colorList3.add("Purole");
    // colorList3.add("White");
    // colorList3.add("Blue");

    // System.out.println();
    // System.out.println("==================Color 2=========================");

    // for (String color2 : colorList2) {
    // System.out.println(color2);
    // }

    // System.out.println();
    // System.out.println("=====================Color 3====================");

    // for (String color3 : colorList3) {
    // System.out.println(color3);
    // }

    // colorList2.addAll(colorList3);
    // System.out.println();
    // System.out.println("==================Append to 2====================");

    // for (String colorAppend : colorList2) {
    // System.out.println(colorAppend);
    // }

    System.out.println("====================student============================");
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("S1", 101));
    students.add(new Student("S2", 102));
    students.add(new Student("S3", 103));

    ArrayList<Student> students1 = new ArrayList<Student>();
    students1.add(new Student("S4", 104));
    students1.add(new Student("S5", 105));
    students1.add(new Student("S3", 103));

    System.out.println("==========STudent List ===========");
    for (Student student : students) {
      System.out.println(student);
    }

    System.out.println("==========STudent List 1 ===========");
    for (Student student : students1) {
      System.out.println(student);
    }

    students.removeAll(students1);

    System.out.println("==========STudent List remove ===========");
    for (Student student : students) {
      System.out.println(student);
    }

  }

}
