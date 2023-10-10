package com.example.datesandlocalizaton;

import java.util.Calendar;
import java.util.Date;

public class WorkingWithUtilDate {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);

    Calendar calender = Calendar.getInstance();
    calender.add(Calendar.MONTH, 2);

    System.out.println(calender.getTime());
  }
}
