package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestSC3 {
    BuggyClass bugclass;

    @Before
    public void setUp() {
        bugclass = new BuggyClass();
    }

    @After
    public void tearDown() {
        bugclass = null;
    }
    //This test has a 100% statement coverage and < 100% branch coverage and reveals the Arithmetic fault.
    @Test
    public void buggyMethod3() {
        assertEquals(0, bugclass.buggyMethod3(4));
    }
}