package com.example.generics.hashsets;

import java.util.HashSet;

public class HashSetTest2 {
  public static void main(String[] args) {
    HashSet<Student> studentSet1 = new HashSet<Student>();
    studentSet1.add(new Student("s1", 101));
    studentSet1.add(new Student("s2", 102));
    studentSet1.add(new Student("s3", 103));
    studentSet1.add(new Student("s4", 104));

    HashSet<Student> studentSet2 = new HashSet<Student>();
    studentSet2.add(new Student("s3", 103));
    studentSet2.add(new Student("s5", 105));
    studentSet2.add(new Student("s6", 106));
    studentSet2.add(new Student("s7", 107));

    System.out.println("========== fro Eachloop studentSet1==========");
    studentSet1.forEach(System.out::println);

    System.out.println("========== for student set 2 ==========");
    studentSet2.forEach(System.out::println);

    studentSet1.addAll(studentSet2);
    System.out.println("========== fro Eachloop studentSet1 add all==========");
    studentSet1.forEach(System.out::println);

    studentSet1.removeAll(studentSet2);
    System.out.println("========== fro Eachloop studentSet1 remove all==========");
    studentSet1.forEach(System.out::println);

    studentSet1.addAll(studentSet2);
    System.out.println("========== fro Eachloop studentSet1 add all==========");
    studentSet1.forEach(System.out::println);

    studentSet1.retainAll(studentSet2);
    System.out.println("========== fro Eachloop studentSet1 retain all==========");
    studentSet1.forEach(System.out::println);

    System.out.println("========== contains all==========");
    System.out.println(studentSet1.contains(new Student("s3", 103)));

    System.out.println("========== contains all==========");
    System.out.println(studentSet1.containsAll(studentSet2));

  }
}
