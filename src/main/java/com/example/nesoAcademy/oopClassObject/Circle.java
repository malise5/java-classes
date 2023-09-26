package com.example.nesoAcademy.oopClassObject;

public class Circle {

  Point center;
  double radius;
  private static int numberOfCircles;

  public Circle() {
    // this.center = new Point(0, 0);
    // this.radius = 1.0;
    numberOfCircles++;
  }

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
    numberOfCircles++;
  }

  double getperimeter() {
    return 2 * Math.PI * this.radius;
  }

  double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public static int getNumberOfCircles() {
    return numberOfCircles;
  }

}
