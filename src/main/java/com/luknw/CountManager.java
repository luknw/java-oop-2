package com.luknw;


public class CountManager extends Manager {

    private final int COUNT;

    public CountManager(String name, int salary, int count) {
        super(name, salary);
        COUNT = count;
    }

    public boolean canHire(Employee employee) {
        return employees.size() + 1 <= COUNT;
    }

    public void hire(Employee employee) {
        if (canHire(employee)) {
            employees.add(employee);
        }
    }
}
