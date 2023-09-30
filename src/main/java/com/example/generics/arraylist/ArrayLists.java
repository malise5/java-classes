package com.example.generics.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> colorList = new ArrayList<String>();
    colorList.add("Red");
    colorList.add("Blue");
    colorList.add("Green");
    colorList.add("Yellow");

    System.out.println("=======Using for each ===========");
    for (String color : colorList) {
      System.out.println(color);
    }
    System.out.println();
    System.out.println("=======Using Iterater ===========");

    Iterator<String> iteratorColor = colorList.iterator();

    while (iteratorColor.hasNext()) {
      String color = iteratorColor.next();
      System.out.println(color);
    }

    System.out.println();
    System.out.println("=======Using Iterater ===========");
    for (int i = 0; i < colorList.size(); i++) {
      System.out.println(colorList.get(i));
    }
  }
}
