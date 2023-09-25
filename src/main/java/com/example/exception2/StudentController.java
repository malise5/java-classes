package com.example.exception2;

import java.util.UUID;

public class StudentController {

  public void addStudent(Student student) throws StudentDetailsExceptions {
    if (student == null) {
      throw new StudentDetailsExceptions("Student Details Not correct!!");
    }
    student.setId(UUID.randomUUID().toString());
  }

}
