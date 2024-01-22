package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestSC2 {
    BuggyClass bugclass;

    @Before
    public void setUp() {
        bugclass = new BuggyClass();
    }

    @After
    public void tearDown() {
        bugclass = null;
    }

    //This test does 100% statement coverage, does not show the fault
    @Test
    public void buggyMethod2() {
        assertEquals(56, bugclass.buggyMethod2(14, 4));
    }
}