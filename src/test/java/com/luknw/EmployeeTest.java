package com.luknw;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee("Bob", 10000);
    }

    @Test
    public void salarySatisfaction() throws Exception {

        employee.salary = 10000;
        assertThat(employee.isSatisfied()).isEqualTo(false);
        employee.salary = 10001;
        assertThat(employee.isSatisfied()).isEqualTo(true);

    }
}