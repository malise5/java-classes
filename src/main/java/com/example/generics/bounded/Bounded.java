package com.example.generics.bounded;

public class Bounded {
  public static void main(String[] args) {

    Integer integerArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    PrintSum<Integer> psInteger = new PrintSum<>();
    psInteger.print(integerArray);

  }
}

class PrintSum<T extends Number> {
  public void print(T[] arr) {
    double sum = 0;

    for (T t : arr) {
      sum = sum + t.doubleValue();
    }
    System.out.println("Sum = " + sum);
  }
}