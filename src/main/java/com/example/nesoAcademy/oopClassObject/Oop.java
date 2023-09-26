package com.example.nesoAcademy.oopClassObject;

public class Oop {
  public static void main(String[] args) {
    System.out.println(Circle.getNumberOfCircles());

    Circle circle = new Circle(new Point(1, 2), 3);
    System.out.println(Circle.getNumberOfCircles());

    Circle circle2 = new Circle(new Point(2, 2), 2);
    System.out.println(Circle.getNumberOfCircles());

    // System.out.println("The area of the circle is: " + circle.getArea());
    // System.out.println("The area of the circle is: " + circle.getperimeter());
    System.out.println("The area of the circle is: " + Circle.getNumberOfCircles());

  }

}
