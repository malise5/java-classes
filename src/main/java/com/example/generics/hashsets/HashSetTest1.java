package com.example.generics.hashsets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
  public static void main(String[] args) {
    HashSet<Student> studentSet = new HashSet<>();

    studentSet.add(new Student("s1", 101));
    studentSet.add(new Student("s3", 103));
    studentSet.add(new Student("s2", 102));
    studentSet.add(new Student("s2", 102));
    studentSet.add(new Student("s2", 102));
    studentSet.add(new Student("s4", 104));

    System.out.println("========== for each loop ==========");
    for (Student student : studentSet) {
      System.out.println(student);
    }

    System.out.println("========== Iterator ==========");
    Iterator<Student> iterator = studentSet.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("========== fro Eaxhloop ==========");
    studentSet.forEach(System.out::println);
  }
}
