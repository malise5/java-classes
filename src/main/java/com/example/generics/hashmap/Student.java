package com.example.generics.hashmap;

public class Student {
  private String name;
  private int rollNo;

  public String getName() {
    return name;
  }

  public Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRollNo() {
    return rollNo;
  }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", rollNo=" + rollNo + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + rollNo;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (rollNo != other.rollNo)
      return false;
    return true;
  }

}