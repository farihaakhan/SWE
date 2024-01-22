package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestBC2 {
    BuggyClass bugclass;

    @Before
    public void setUp() {
        bugclass = new BuggyClass();
    }

    @After
    public void tearDown() {
        bugclass = null;
    }

    //This test does > 50%  branch coverage and reveals the Arithmetic fault
    @Test
    public void buggyMethod2() {
        assertEquals(1, bugclass.buggyMethod2(3, 8));
    }
}
