package com.junit;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    
  }

  public int getEmpCountWithSalaryAboveHundredK(Service service){
    int count = 0;
    ArrayList<Employee> empl = service.getEmpFromDB();
    for (Employee employee : empl) {
      if(employee.getSalary() >= 100000){
        count++;
      }
    }
    return count;
  }

}
