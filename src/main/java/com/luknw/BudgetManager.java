package com.luknw;


public class BudgetManager extends Manager {

    private final int BUDGET;

    public BudgetManager(String name, int salary, int budget) {
        super(name, salary);
        BUDGET = budget;
    }

    public boolean canHire(Employee employee) {
        int salarySum = 0;
        for (Employee next : employees) {
            salarySum += next.salary;
        }
        return salarySum + employee.salary <= BUDGET;
    }

    public void hire(Employee employee) {
        if (canHire(employee)) {
            employees.add(employee);
        }
    }
}
