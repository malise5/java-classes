package com.example.functionalprogramming;

@FunctionalInterface
public interface Calculator {
  abstract int calculator(int a, int b, int... numbers);

  default int sum(int a, int b) {
    return a + b;
  }

  static String printInfo() {
    return "Hello World";
  }
}
