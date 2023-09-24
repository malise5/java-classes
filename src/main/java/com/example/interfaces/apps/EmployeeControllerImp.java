package com.example.interfaces.apps;

import java.util.UUID;

public class EmployeeControllerImp implements EmployeeController {

  @Override
  public Employee createEmployee(Employee employee) {

    employee.setId(UUID.randomUUID().toString());
    System.out.println(employee);
    return employee;
  }

  public static void main(String[] args) {
    EmployeeController controller = new EmployeeControllerImp();

    Employee employee = new Employee();

    controller.createEmployee(employee);
  }

}
