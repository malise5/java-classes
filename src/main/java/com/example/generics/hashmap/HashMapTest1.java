package com.example.generics.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
  public static void main(String[] args) {

    HashMap<Integer, Student> studentMap1 = new HashMap<>();

    studentMap1.put(1, new Student("s2", 102));
    studentMap1.put(2, new Student("s1", 101));
    studentMap1.put(3, new Student("s3", 103));

    HashMap<Integer, Student> studentMap2 = new HashMap<>();

    studentMap2.put(3, new Student("s4", 104));
    studentMap2.put(4, new Student("s3", 103));
    studentMap2.put(5, new Student("s5", 105));

    System.out.println("=============student Map1================");
    for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }

    System.out.println("=============student Map2================");
    for (Map.Entry<Integer, Student> entry : studentMap2.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }

    studentMap1.putAll(studentMap2);
    System.out.println("=============studentMap.putall(studentMapp2)================");
    for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }

  }
}
