package edu.qc.seclass;

public class BuggyClass {

    //100% statement coverage and does not reveal the fault,
    //Less than 50% statement coverage and reveals the fault.
    public int buggyMethod1(int x, int y) {
        int z;
            if (x > y) {
                z = x / y;
            }
            if (y % 2 == 0) {
                y = 0;
            }
                z = x / y;

            if (z % 2 == 0) {
                z = x / z;
            }
        return z;
    }

    //100% statement coverage and does not reveal the fault
    //More than 50% branch coverage reveals the fault.
    public int buggyMethod2(int x, int y) {
        int z = x;
            if (y % 2 == 0) {
                z = 0;
            }
            if (x > y) {
                z = x * y;
            }
            else {
                z = x / z;
            }
        return z;
    }

    //100% branch coverage and does not reveal the fault
    //100% statement coverage, does not achieve 100% branch coverage, and reveals the fault.
    public int buggyMethod3(int x) {
        int z = x;
            if (z % 10 == 0) {
                z = x / 10;
            }
            else if (z % 15 == 0) {
                z += 2;
            }
            else if (z != 11) {
                z = x / (x - 4);
            }
        return z;
    }

    //100% statement coverage reveals the fault, and
    //100% branch coverage and does not reveal the fault.
    public void buggyMethod4() {

        /*As Branch coverage has a higher hierarchy than Statement
        /coverage it's not possible to have branch coverage
        /that doesn't find the fault that statement coverage did.
        */
    }

    public void buggyMethod5() {

        /*Not possible to have a 100% statement coverage with no fault revealed.
        /Line 4 has division by zero which will be revealed as an Arithmetic fault.
        */
    }
}