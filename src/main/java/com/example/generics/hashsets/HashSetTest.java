package com.example.generics.hashsets;

import java.util.HashSet;

public class HashSetTest {
  public static void main(String[] args) {
    HashSet<String> color = new HashSet<>();

    System.out.println(color.add("Red"));
    System.out.println(color.add("Blue"));
    System.out.println(color.add("green"));
    System.out.println(color.add("Blue"));
  }
}
