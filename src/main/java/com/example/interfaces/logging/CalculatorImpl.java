package com.example.interfaces.logging;

public class CalculatorImpl implements Calculator {

  @Override
  public int sum(int a, int b) {
    return a + b;
  }

  @Override
  public int sum(int a, int b, int... args) {

    int sum = a + b;

    for (int i = 0; i < args.length; i++) {
      sum = +args[i];
    }

    return sum;
  }

}
