package com.example.arrayLists;

public class Food {

  String name;

  public Food(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Choosen food is: " + name;
  }

}
