package com.luknw;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CountManagerTest {

    CountManager countManager;

    @Before
    public void setUp() throws Exception {
        countManager = new CountManager("Jimmy", 1000, 10);
    }

    @Test
    public void canHire() throws Exception {

        Employee tmp = null;

        for (int i = 0; i < 10; i++) {
            tmp = new Employee(Integer.toString(i), 100);
            assertThat(countManager.canHire(tmp)).isEqualTo(true);

            countManager.hire(tmp);
            assertThat(countManager.employees).contains(tmp);
        }

        assertThat(countManager.canHire(tmp)).isEqualTo(false);

    }

}