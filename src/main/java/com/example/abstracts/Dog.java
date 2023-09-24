package com.example.abstracts;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Woof");
  }

}
