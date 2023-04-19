package com.junit;

import java.util.ArrayList;

public class Service {
      public ArrayList<Employee> getEmpFromDB(){
        /* Assume this method
         * 1. Connects to DB
         * 2. Fetch all the employee from specified table
         * 3. returns them as list.
        */
    
        ArrayList<Employee> empl = new ArrayList<Employee>();
        empl.add(new Employee("A", 100000 ));
        empl.add(new Employee("B", 1000 ));
        empl.add(new Employee("C", 100000 ));
        empl.add(new Employee("D", 10000 ));
        empl.add(new Employee("E", 10000 ));
        empl.add(new Employee("F", 100000 ));
        empl.add(new Employee("G", 100 ));
        return empl;
      }
}
