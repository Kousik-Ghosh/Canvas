package com.junit;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestApp {

  Service serviceMock;

  @BeforeEach
  void testPreperation(){
    ArrayList<Employee> empStub = new ArrayList<Employee>();
    empStub.add(new Employee("A", 100000 ));
    empStub.add(new Employee("B", 1000 ));
    empStub.add(new Employee("C", 100000 ));

    serviceMock = mock(Service.class);
    when(serviceMock.getEmpFromDB()).thenReturn(empStub);
  }

  @Test
  public void testEmpCountSalaryAboveHundredK() {
    assertEquals(2, new App().getEmpCountWithSalaryAboveHundredK(serviceMock));
  }


}
