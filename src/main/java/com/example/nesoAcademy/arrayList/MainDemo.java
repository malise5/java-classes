package com.example.nesoAcademy.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList();

    System.out.println("Enter 5 Integers: ");
    try (Scanner scanner = new Scanner(System.in)) {

      for (int i = 0; i < 5; i++) {
        int num = Integer.parseInt(scanner.nextLine());

        if (!list.contains(num)) {
          list.add(num);
        }
      }
      Collections.sort(list);
      System.out.println(list);
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
