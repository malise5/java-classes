package com.example.example3;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
  private ArrayList<Items> cart;
  Scanner scanner;

  private final String ADMIN_PASSWORD = "Admin123";
  private int loginAttempts;
  private final int MAX_LOGIN_ATTEMPTS = 3;

  public ItemList() {
    cart = new ArrayList<>();
    scanner = new Scanner(System.in);
  }

  public boolean login() {
    System.out.println("*********** KARIBU ***********");
    System.out.print("Enter Admin password to Continue: ");
    String enteredPassword = scanner.nextLine();

    if (enteredPassword.equals(ADMIN_PASSWORD)) {
      return true;
    }

    loginAttempts++;
    System.out.println("Incorrect password. Attempts left: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));

    if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
      System.out.println("Maximum login attempts reached. Exiting.");
      return false;
    }

    return login();
  }

  public void addItem() {
    System.out.print("Enter item name: ");
    String name = scanner.nextLine();
    System.out.print("Enter Item Quantity: ");
    int quantity = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter item price: ");
    int price = Integer.parseInt(scanner.nextLine());

    Items item = new Items(name, quantity, price);
    cart.add(item);
    System.out.println("Items added to cart: ");

    System.out.print("Do you want to continue Shopping? press any key for yes and (n) for No (y/n): ");
    String con = scanner.nextLine();
    if (con.equalsIgnoreCase("n")) {
      payForItems();
    }
  }

  public void displayItems() {
    if (cart.isEmpty()) {
      System.out.println("The item List is Empty: ");
      addItem();
    } else {
      double totalAmount = 0;
      System.out.println("***********Items in the list: *************");
      for (Items items : cart) {
        double itemPrice = items.getPrice() * items.getQuantity();
        totalAmount += itemPrice;
        System.out.println();
        System.out.println("Item Name: " + items.getName());
        System.out.println("Quantity: " + items.getQuantity());
        System.out.println("Price per item: " + items.getPrice());
        System.out.println("Total Price for this item: " + totalAmount);
        System.out.println();
      }
      System.out.println("Overall Total Price: " + totalAmount);
    }
  }

  public void payForItems() {
    if (cart.isEmpty()) {
      System.out.println("The item list is empty. Cannot generate a receipt.");
      return;
    }
    System.out.print("Enter the amount you want to pay: ");
    double paymentAmount = scanner.nextDouble();

    double totalPrice = 0;
    for (Items items : cart) {
      totalPrice += items.getPrice() * items.getQuantity();
    }
    if (paymentAmount >= totalPrice) {
      double change = paymentAmount - totalPrice;
      System.out.println("Payment successful! Change to return: " + change);
      // cart.clear(); // Clear the item list after payment
    } else {
      System.out.println("Insufficient payment. Payment failed.");
      System.out.println("Please topUp: ");
    }

  }

  public void printReceipt() {
    if (cart.isEmpty()) {
      System.out.println("The item list is empty. Cannot generate a receipt.");
      return;
    }

    double totalPrice = 0;

    System.out.println("********Receipt:****************");
    System.out.println("--------------------------------------------------------");
    for (Items items : cart) {
      double itemTotalPrice = items.getQuantity() * items.getPrice();
      totalPrice += itemTotalPrice;
      System.out.printf("Item: %-20s Quantity: %-5d Price per item: $%-5d Total Price: $%-5d%n",
          items.getName(), items.getQuantity(), items.getPrice(), items.getQuantity() * items.getPrice());
    }
    System.out.println("--------------------------------------------------------");
    System.out.println(+totalPrice);
  }

}
