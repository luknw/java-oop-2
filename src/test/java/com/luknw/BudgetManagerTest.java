package com.luknw;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BudgetManagerTest {

    BudgetManager budgetManager;

    @Before
    public void setUp() throws Exception {
        budgetManager = new BudgetManager("Kira", 456, 100000);
    }

    @Test
    public void canHire() throws Exception {
        Employee tmp = null;

        for (int i = 0; i < 10; i++) {
            tmp = new Employee(Integer.toString(i), 10000);
            assertThat(budgetManager.canHire(tmp)).isEqualTo(true);

            budgetManager.hire(tmp);
            assertThat(budgetManager.employees).contains(tmp);
        }

        assertThat(budgetManager.canHire(tmp)).isEqualTo(false);

    }
}