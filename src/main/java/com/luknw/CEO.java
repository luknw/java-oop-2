package com.luknw;


public class CEO extends Manager {

    public CEO(String name, int salary) {
        super(name, salary);
    }

    boolean canHire(Employee employee) {
        return true;
    }

    void hire(Employee employee) {
        employees.add(employee);
    }
}
