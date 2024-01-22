package edu.qc.seclass;
import org.junit.*;

import static org.junit.Assert.*;

public class BuggyClassTestSC1a {
    BuggyClass bugclass;

    @Before
    public void setUp() {
        bugclass = new BuggyClass();
    }

    @After
    public void tearDown() {
        bugclass = null;
    }

    //This test does 100% statement coverage, does not reveal fault
    @Test
    public void buggyMethod1() {
        assertEquals(1, bugclass.buggyMethod1(7, 5));
    }
}