package com.example.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.interfaces.logging.Calculator;
import com.example.interfaces.logging.CalculatorImpl;

public class CalculatorTest {
  Calculator app;

  @BeforeEach
  void setUp() {
    app = new CalculatorImpl();
  }

  @Test
  public void sum() {
    int expected = 3;
    int actual = app.sum(1, 2);

    assertEquals(expected, actual);
  }

  class TestCalculator implements Calculator {

    @Override
    public int sum(int a, int b) {

      return a + b;
    }

    @Override
    public int sum(int a, int b, int... args) {
      int sum = a + b;

      for (int i = 0; i < args.length; i++) {
        args[i] = +sum;
      }

      return sum;
    }

  }

}
