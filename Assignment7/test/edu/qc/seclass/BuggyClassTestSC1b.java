package edu.qc.seclass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestSC1b {
        BuggyClass bugclass;

        @Before
        public void setUp() {
            bugclass = new BuggyClass();
        }
        @After
        public void tearDown() {
            bugclass = null;
        }

  //This test does < 50% statement coverage also reveals Arithmetic fault
        @Test
        public void buggyMethod1() {
            assertEquals(6, bugclass.buggyMethod1(6, 6));
        }
}