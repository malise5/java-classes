package com.example.examples;

public class Main {
  public static void main(String[] args) {

    Account testAccount = new Account(122, 20000, 4.5);

    if (testAccount.withdraw(20000)) {
      System.out.println("Withdraw was Successfull");
    } else {
      System.out.println("Withdraw Failed");
    }

    testAccount.deposit(3000);
    System.out
        .println("id: " + testAccount.getId() + "=> " + testAccount.getBalance() + " "
            + testAccount.getAnnualInterestRate());
    System.out.println(testAccount);

  }

}
