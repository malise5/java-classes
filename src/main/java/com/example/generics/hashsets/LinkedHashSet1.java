package com.example.generics.hashsets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
  public static void main(String[] args) {
    HashSet<Student> studentHashSet = new HashSet<>();

    studentHashSet.add(new Student("s1", 101));
    studentHashSet.add(new Student("s3", 103));
    studentHashSet.add(new Student("s2", 102));
    studentHashSet.add(new Student("s4", 104));

    LinkedHashSet<Student> studentSet2 = new LinkedHashSet<>();
    studentSet2.add(new Student("s1", 101));
    studentSet2.add(new Student("s3", 103));
    studentSet2.add(new Student("s2", 102));
    studentSet2.add(new Student("s4", 104));

    System.out.println("======= student set 1 HashSet =================================");
    studentHashSet.forEach(System.out::println);

    System.out.println("======= student set 2 LinkedHashSet =================================");
    studentSet2.forEach(System.out::println);

  }
}
