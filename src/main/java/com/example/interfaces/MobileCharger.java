package com.example.interfaces;

public class MobileCharger implements ThreePinPlug {

  @Override
  public boolean plugIn() {
    System.out.println("Mobile charger connnected");
    return false;
  }

  @Override
  public boolean plugOut() {
    System.out.println("Mobile charger Disconnnected");
    return false;
  }

}
