package com.example.random;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random number = new Random();

    int x = number.nextInt(10);
    float y = number.nextFloat();

    System.out.println(x);
    System.out.println(y * 10);

  }
}
