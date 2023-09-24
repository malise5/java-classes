package com.example.exceptions;

import java.util.UUID;

public class StudentController {

  public void addStudent(Student student) throws MissingException {
    if (student == null) {
      throw new MissingException("The student is not Valid");
    }
    student.setId(UUID.randomUUID().toString());
    System.out.println("Student Added");
  }

}
