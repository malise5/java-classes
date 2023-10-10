package com.example.javaprojects.emailapp;

import java.util.Scanner;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private String department;
  private String email;
  private int mailboxCapacity = 500;
  private int defaultPasswordLength = 10;
  private String alternateEmail;
  private String companySuffix = "systech.com";

  Scanner scanner = new Scanner(System.in);

  public Email(String firstaname, String lastname) {
    // System.out.println("Enter firstname: ");
    // String first = scanner.nextLine();
    // System.out.println("Enter lastname: ");
    // String lastname = scanner.nextLine();

    this.firstname = firstaname;
    this.lastname = lastname;

    System.out.println("Created Email: " + this.firstname + " " + this.lastname);

    // call method to ask fro department
    this.department = setDepartment();
    System.out.println("Department is: " + this.department);

    // call the password or set it yourself
    // System.out.println("Do you eant to Generate your password or Set it
    // yourself?: (set/gen)");
    // String set = scanner.nextLine();
    // if (set.equalsIgnoreCase("set")) {
    // System.out.println("Enter your password: ");
    // String setPassword = scanner.nextLine();
    // this.password = setPassword;
    // System.out.println("Your password is:" + this.password);
    // } else {
    // this.password = randomPassword(defaultPasswordLength);
    // System.out.println("Your password is: " + this.password);
    // }

    // call the password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is: " + this.password);

    // combine elements to generate email
    email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
    // System.out.println("Your Email is " + email);

  }

  // ask for department
  private String setDepartment() {
    System.out.print(
        "Enter Your Department:\n 1 for sale,\n 2 for Development,\n 3 for Accounting,\n 0 for none\n Enter optinon: ");
    int department = Integer.parseInt(scanner.nextLine());
    if (department == 1) {
      return "Sales";
    } else if (department == 2) {
      return "Development";
    } else if (department == 3) {
      return "Accounting";
    } else {
      return "";
    }
  }

  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234456789!@#$&%";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int randomChar = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(randomChar);
    }
    return new String(password);

  }

  // set the mailbox Capacity
  public void setMailCapacity(int capacity) {
    this.mailboxCapacity = capacity;
  }

  // alternate Email
  public void setAlternateEmail(String altEmail) {
    this.alternateEmail = altEmail;
  }

  // change the password
  public void changePassword(String newPassword) {
    this.password = newPassword;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getMailboxCapacity() {
    return mailboxCapacity;
  }

  public void setMailboxCapacity(int mailboxCapacity) {
    this.mailboxCapacity = mailboxCapacity;
  }

  public int getDefaultPasswordLength() {
    return defaultPasswordLength;
  }

  public void setDefaultPasswordLength(int defaultPasswordLength) {
    this.defaultPasswordLength = defaultPasswordLength;
  }

  public String getAlternateEmail() {
    return alternateEmail;
  }

  public String getCompanySuffix() {
    return companySuffix;
  }

  public void setCompanySuffix(String companySuffix) {
    this.companySuffix = companySuffix;
  }

  @Override
  public String toString() {
    return "Your Infor:\n firstname : " + firstname + "\n lastname : " + lastname + "\n department : " + department
        + "\n email : "
        + email + "\n mailboxCapacity : " + mailboxCapacity + "Mb";
  }

}
