package com.example.exception2;

public class Calculator {

  public double divide(int a, int b) {
    double result = 0.0;
    try {
      return a / b;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return result;
  }

  public int sum(int a, int b) throws MyCustomException {
    throw new MyCustomException("Method not implemented");
  }
}
