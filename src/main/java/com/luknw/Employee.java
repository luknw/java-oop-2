package com.luknw;


public class Employee {

    public String name;
    public int salary;
    private final int SATISFYING_SALARY = 10000;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public boolean isSatisfied() {
        return salary > SATISFYING_SALARY;
    }
}
