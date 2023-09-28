package com.example.example3;

public class Items {
  private String name;
  private int quantity;
  private int price;

  public String getName() {
    return name;
  }

  public Items() {
  }

  public Items(String name, int quantity, int price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Items [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
  }

}
