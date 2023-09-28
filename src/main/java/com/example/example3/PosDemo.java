package com.example.example3;

import java.util.InputMismatchException;

public class PosDemo {
  public static void main(String[] args) {
    ItemList app = new ItemList();
    boolean condition = true;

    if (app.login()) {
      while (condition) {
        try {
          System.out.println("Menu:");
          System.out.println("1. Add item");
          System.out.println("2. Display items");
          System.out.println("3. Pay for items");
          System.out.println("4. Exit");
          System.out.print("Enter your choice: ");
          String choice = app.scanner.nextLine();

          switch (choice) {
            case "1":
              app.addItem();
              break;
            case "2":
              app.displayItems();
              break;
            case "3":
              app.payForItems();
              break;
            case "4":
              System.out.println("Exiting...");
              condition = false;
              break;

            default:
              System.out.println("Invalid choice. Please try again.");
          }
        } catch (IllegalStateException e) {
          System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
          System.out.println("Invalid input. Please enter a valid choice.");
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid number.");
          return;
        } finally {
          // app.scanner.close();
        }

      }
    }

  }

  // InputMismatchException - if the next token does not match the Float regular
  // expression, or is out of range

  // NoSuchElementException - if the input is exhausted

  // IllegalStateException - if this scanner is closed

}
