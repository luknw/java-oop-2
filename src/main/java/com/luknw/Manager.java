package com.luknw;

import java.util.ArrayList;


abstract class Manager extends Employee {

    public Manager(String name, int salary) {
        super(name, salary);
        employees = new ArrayList<Employee>();
    }

    abstract boolean canHire(Employee employee);

    abstract void hire(Employee employee);

    public ArrayList<Employee> employees;
}
