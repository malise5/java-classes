package com.example.labdaExpressions;

import java.util.function.Predicate;

public class PredicateLabdaTest {
  public static void main(String[] args) {

    // example1
    Predicate<Integer> p = i -> i > 10;

    boolean x = p.test(0);

    if (x) {
      System.out.println("Message Sent");
    } else {
      System.out.println("Invalid");
    }

    // example 2

  }

}
