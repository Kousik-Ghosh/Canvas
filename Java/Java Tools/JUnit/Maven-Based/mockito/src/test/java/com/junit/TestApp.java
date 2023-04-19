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
    /* Stub data*/
    ArrayList<Employee> empStub = new ArrayList<Employee>();
    empStub.add(new Employee("A", 100000 ));
    empStub.add(new Employee("B", 1000 ));
    empStub.add(new Employee("C", 100000 ));

    /* Mocking
     * - Does not care about application logic
    */
    serviceMock = mock(Service.class);

    /* Subbing */
    when(serviceMock.getEmpFromDB()).thenReturn(empStub);
  }

  @Test
  public void testEmpCountSalaryAboveHundredK() {
    assertEquals(2, new App().getEmpCountWithSalaryAboveHundredK(serviceMock));
  }


}
