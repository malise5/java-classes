package com.example.whileLoop;

import java.util.Scanner;

public class WhileDemo {
  public static void main(String[] args) {
    Scanner inputs = new Scanner(System.in);

    String name = "";

    while (name.isEmpty()) {
      System.out.println("Please Enter Your Nameto proceed:  ");

      name = inputs.nextLine();
    }
    System.out.println("Hello " + name);
    inputs.close();
  }

}
