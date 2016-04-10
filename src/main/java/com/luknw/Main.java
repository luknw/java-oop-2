package com.luknw;


public class Main {
    public static void main(String[] args) {
        Company oggole = Company.INSTANCE;

        oggole.hireCEO(new CEO("Parry Lage", 100000));

        for (int i = 0; i < 5; i++) {
            oggole.ceo.hire(new CountManager(Integer.toString(i), i * 10000, i * 10));
        }
        for (int i = 0; i < 5; i++) {
            oggole.ceo.hire(new BudgetManager(Integer.toString(10 - i), i * 10000, i * 10000));
        }
        for (int i = 0; i < 5; i++) {
            oggole.ceo.hire(new Employee(Integer.toString(10000 - i), i * 7500));
        }
        for (Employee employee : oggole.ceo.employees) {
            if (employee instanceof Manager) {
                for (int i = 0; i < 5; i++) {
                    ((Manager) employee).hire(new Employee(Integer.toString(1000 - i), i * 5000));
                }
            }
        }

        System.out.println(oggole.toString());
    }
}
