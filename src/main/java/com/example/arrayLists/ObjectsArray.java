package com.example.arrayLists;

public class ObjectsArray {
  public static void main(String[] args) {
    // Food[] freezer = new Food[3];

    Food food1 = new Food("Skuma Wiki");
    Food food2 = new Food("Pizza");
    Food food3 = new Food("Mchele");

    Food[] freezer = { food1, food2, food3 };

    // freezer[0] = food1;
    // freezer[1] = food2;
    // freezer[2] = food3;

    System.out.println(freezer[1]);
    System.out.println(freezer[0]);
    System.out.println(freezer[2]);

  }
}
