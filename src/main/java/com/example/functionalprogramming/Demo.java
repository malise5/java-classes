package com.example.functionalprogramming;

import java.util.List;
import java.util.stream.Stream;

public class Demo {
  public static void main(String[] args) {
    Demo demo = new Demo();
    // demo.functions();
    // demo.labdaStrings();
    // demo.filterMap();
    demo.filterandChain();
  }

  public void filterandChain() {
    List<Integer> numbers = List.of(1, 2, 3, 4);
    numbers.stream().filter(number -> number % 2 == 0).map(number -> number * 2)
        .forEach(number -> System.out.println(number));
  }

  public void filterMap() {
    List<Integer> numbers = List.of(1, 2, 3, 4);
    // creates a stream
    Stream<Integer> stream = numbers.stream();
    // filter a stream
    Stream<Integer> stream2 = stream.filter(x -> x % 2 == 0);
    // map transformation
    Stream<Integer> stream3 = stream2.map(number -> number * number);
    // display final product
    stream3.forEach(number -> System.out.println(number));
  }

  public void labdaStrings() {
    List<Integer> integers = List.of(1, 2, 3, 4);
    integers.forEach(number -> System.out.println(number * number));
  }

  public void functions() {
    Calculator calculator = (a, b, numbers) -> a + b;
    Calculator calculator2 = (a, b, numbers) -> {
      int sum = a + b;
      for (int i : numbers) {
        sum += i;
      }
      return sum;
    };
    System.out.println(calculator.calculator(10, 11));
    System.out.println(calculator.calculator(20, 20, 100));
  }
}
