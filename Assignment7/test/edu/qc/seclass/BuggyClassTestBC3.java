package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestBC3 {
    BuggyClass bugclass;

    @Before
    public void setUp() {
        bugclass = new BuggyClass();
    }

    @After
    public void tearDown() {
        bugclass = null;
    }
    //100% Branch Coverage, does not reveal fault.
    @Test
    public void buggyMethod3() {
        assertEquals(10, bugclass.buggyMethod3(100));
    }
}