package com.example.nesoAcademy.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddItem {
  public static void main(String[] args) {
    ArrayList<Integer> items = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      displayMenu();
      int option = scanner.nextInt();

      if (option == 1) {
        // Add
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();
        items.add(input);

      } else if (option == 2) {
        // Remove
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();
        if (items.contains(input)) {
          items.remove(Integer.valueOf(input));
          System.out.println("Removes: ");
        } else {
          System.out.println("Items Not Found: ");
        }

      } else if (option == 3) {
        // Display
        System.out.println("Your lis: " + items);
      } else if (option == 4) {
        System.out.println("Good Bye");
        break;

      }
    }

  }

  // private static void add() {}

  private static void displayMenu() {
    System.out.println();
    System.out.println("1. Add Item");
    System.out.println("2. Remove Item");
    System.out.println("3. Display Item");
    System.out.println("4. Exit");
    System.out.println();
    System.out.print("Enter Your Choice: ");

  }

}
