package com.example.generics.arraylist;

import java.util.ArrayList;

public class ArraListCintains {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();

    list.add(new Student("s1", 100));
    list.add(new Student("s2", 101));
    list.add(new Student("s3", 102));

    ArrayList<Student> list1 = new ArrayList<>();

    list1.add(new Student("s4", 103));
    list1.add(new Student("s5", 104));
    list1.add(new Student("s6", 105));

    System.out.println("========String lis=========");
    for (Student array1 : list) {
      System.out.println(array1);
    }

    System.out.println("========String lis1 =========");
    for (Student array2 : list1) {
      System.out.println(array2);
    }

    System.out.println("=======Contains========");
    System.out.println(list.contains(new Student("s3", 102)));
  }
}
