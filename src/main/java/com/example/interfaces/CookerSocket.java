package com.example.interfaces;

public class CookerSocket implements ThreePinPlug {

  @Override
  public boolean plugIn() {
    System.out.println("Cooker charger connnected");
    return false;
  }

  @Override
  public boolean plugOut() {
    System.out.println("Cooker charger Disconnnected");
    return false;
  }

}
