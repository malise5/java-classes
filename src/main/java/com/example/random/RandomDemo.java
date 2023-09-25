package com.example.random;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.logger.CustomFormatter;
import com.example.logger.FileLogging;

public class RandomDemo {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  public static void main(String[] args) throws SecurityException, IOException {
    FileHandler fh = new FileHandler("log.txt");
    CustomFormatter formatter = new CustomFormatter();

    LOGGER.addHandler(fh);
    fh.setFormatter(formatter);

    LOGGER.info("info Message Logging\n");
    LOGGER.severe("Error Message\n");
    LOGGER.warning("Warning Message Logn\n");

    Random number = new Random();

    int x = number.nextInt(10);
    float y = number.nextFloat();

    System.out.println(x);
    System.out.println(y * 10);

    LOGGER.info("rANDOMdEMO");
  }
}
