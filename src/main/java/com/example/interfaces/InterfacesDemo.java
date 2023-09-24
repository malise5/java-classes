package com.example.interfaces;

public class InterfacesDemo {

  public static void main(String[] args) {
    ThreePinPlug mc = new MobileCharger();
    ThreePinPlug cc = new CookerSocket();

    mc.plugIn();
    mc.plugOut();

    cc.plugIn();
  }

}
