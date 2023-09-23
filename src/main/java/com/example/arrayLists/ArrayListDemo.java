package com.example.arrayLists;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> foods = new ArrayList<String>();

    foods.add("Skuma Wiki");
    foods.add("Ugali");
    foods.size();

    for (int i = 0; i < foods.size(); i++) {
      System.out.println(foods.get(i));
    }

  }
}
