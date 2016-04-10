package com.luknw;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class CompanyTest {

    Company oggole;

    @Before
    public void setUp() throws Exception {
        oggole = Company.INSTANCE;
    }

    @Test
    public void toStringLayout() throws Exception {
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

        String s = System.lineSeparator();

        String correctLayout =
                "Parry Lage - CEO" + s
                        + "\t0 - Manager" + s
                        + "\t1 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t\t997 - Employee" + s
                        + "\t\t996 - Employee" + s
                        + "\t2 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t\t997 - Employee" + s
                        + "\t\t996 - Employee" + s
                        + "\t3 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t\t997 - Employee" + s
                        + "\t\t996 - Employee" + s
                        + "\t4 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t\t997 - Employee" + s
                        + "\t\t996 - Employee" + s
                        + "\t10 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t9 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t8 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t7 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t\t997 - Employee" + s
                        + "\t6 - Manager" + s
                        + "\t\t1000 - Employee" + s
                        + "\t\t999 - Employee" + s
                        + "\t\t998 - Employee" + s
                        + "\t\t997 - Employee" + s
                        + "\t10000 - Employee" + s
                        + "\t9999 - Employee" + s
                        + "\t9998 - Employee" + s
                        + "\t9997 - Employee" + s
                        + "\t9996 - Employee";

        assertThat(oggole.toString()).isEqualTo(correctLayout);
    }

}