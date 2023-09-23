package com.example.scanner;

import java.util.Scanner;

public class ScannerArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] names = new String[3];

    System.out.println("Add Group members Names: ");
    names[0] = scanner.nextLine();
    names[1] = scanner.nextLine();
    names[2] = scanner.nextLine();

    System.out.println();
    System.out.println("Printing.....");

    // for (int i = 0; i < names.length; i++) {
    // System.out.println(names[i]);
    // }
    for (String string : names) {
      System.out.println(string.toUpperCase());
    }

    scanner.close();
  }
}
