package com.example.scanner;

import java.util.Scanner;

public class ScannerDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name;
    int age;
    float shoeSize;

    System.out.println("Please Enter Your Full Names: ");
    name = scanner.nextLine();

    System.out.println("Please Enter Your Age: ");
    age = scanner.nextInt();

    System.out.println("Please Enter Your ShoeSize: ");
    shoeSize = scanner.nextFloat();

    System.out.println("My Name is " + name + " " + age + " " + shoeSize);
  }

}
