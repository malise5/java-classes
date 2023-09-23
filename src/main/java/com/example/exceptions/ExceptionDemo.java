package com.example.exceptions;

public class ExceptionDemo {

  public static void main(String[] args) throws MyException {
    int i = 20;
    int j = 0;

    try {
      j = 18 / i;
      if (j == 0) {
        throw new MyException("Can not be a Zero");
      }
      System.out.println(j);
    } catch (MyException e) {
      System.out.println("van not divide " + e.getMessage());
    }

  }

}

class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}
