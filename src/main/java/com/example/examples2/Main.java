package com.example.examples2;

import com.example.examples.Account;

public class Main {
  public static void main(String[] args) {

    Client[] clients = new Client[2];
    clients[0] = new Client(100, "Kudez", "12345678");
    clients[0].addAccount(new Account(1, 100, 1.5));
    clients[0].addAccount(new Account(2, 200, 2.5));

    clients[1] = new Client(101, "Malise", "12345678");
    clients[1].addAccount(new Account(3, 5000, 8.5));
    clients[1].addAccount(new Account(4, 6000, 6.5));
    clients[1].addAccount(new Account(5, 7000, 5.5));

    System.out.println(clients[0].toString());
    System.out.println();
    System.out.println(clients[1]);

  }
}
