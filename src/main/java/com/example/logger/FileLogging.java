package com.example.logger;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;
// import java.util.logging.Formatter;
// import java.util.logging.LogRecord;
// import java.util.logging.Logger;

public class FileLogging {
  private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

  public static void main(String[] args) throws SecurityException, IOException {
    FileHandler fh = new FileHandler("log.txt");
    CustomFormatter formatter = new CustomFormatter();

    LOGGER.addHandler(fh);
    fh.setFormatter(formatter);

    LOGGER.info("info Message Logging\n");
    LOGGER.severe("Error Message\n");
    LOGGER.warning("Warning Message Logn\n");
    test();

  }

  public static void test() {
    LOGGER.info("info Message Logging\n");
    LOGGER.severe("Error Message\n");
    LOGGER.warning("Warning Message Logn\n");
  }

  static class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {

      DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
      String method = record.getSourceMethodName();
      String level = record.getLevel().getName();
      String message = record.getMessage();
      // record.getParameters();
      Instant instant = record.getInstant();
      LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
      return pattern.format(now) + " || " + "instant" + " || " + method + " || " + level + " || " + message;
    }

  }

}
