package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }
    //test to check if returns 7 because string has 7 different digits
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
    
    //tests if the program throws nullpointers
    @Test(expected = NullPointerException.class )
    public void testCountNumbers2() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }
    
    //test if returns 0 when there is no digits
    @Test
    public void testCountNumbers3() {
    	mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    } 
    
    //test to check if it works when there is numbers back to back
    @Test
    public void testCountNumbers4() {
    	mycustomstring.setString("check if 123 456 99 10");
        assertEquals(4, mycustomstring.countNumbers());
    }
    
    //test if works with special charaters.
    @Test
    public void testCountNumbers5() {
    	 mycustomstring.setString("..4.+..98-=..817-13..+=23+ 1 0 0");
         assertEquals(8, mycustomstring.countNumbers());
     }

    //test to check if it works with digits only. Should return 1 because its one big digit.
    @Test
    public void testCountNumbers6() {
    	 mycustomstring.setString("123456");
         assertEquals(1, mycustomstring.countNumbers());
     }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    
    //test to check nullpointers
    @Test (expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	  mycustomstring.setString (null);
          mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false);
      }
    
    //test to check illegalargumentexception
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	 mycustomstring.setString("Test this exception");
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
     }

    //test to print out the entire string by iteration
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	 mycustomstring.setString("Will print completely same thing");
         assertEquals("Will print completely same thing", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
     }

    //test with an empty string should result into empty string.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    //Test to check if it returns the empty string when the n value is greater than the length of the string. 
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("four");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }

    //Test to check if it returns only one character which is the last character when given the input n.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	 mycustomstring.setString("Last character");
         assertEquals("r", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(14, false));
     }
    
    //Test to check if it returns only one character which is the last character when given the input n.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("Last character");
    	assertEquals("L", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(14, true));
    }

    //test to check if it works if the string only contains digits.Should print numbers.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	 mycustomstring.setString("1 2 3 4 5 6 7 8 9 ");
         assertEquals("123456789", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
     }

    //test to check if prints special characters
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	 mycustomstring.setString("!@#$%^&*()_+");
         assertEquals("!$&)", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
     }
    
    //test to check if it prints every n,2n,3n.. characters
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	 mycustomstring.setString("a1b2c3d4e5f6");
         assertEquals("abcdef", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
     }
    
    //Test to check if it returns the middle character when given half of string length.
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("Middle Char");
        assertEquals("e", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(6, false));
    }

    //test to check IllegalArgumentException again with negative number
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("Test this exception again");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, false);
    }

    //test to check if converts to english from digits between the specified positions
    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    //test to check nullpointers
    @Test (expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring2() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1,2);
    }
    
    //test to check IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring3() {
    	 mycustomstring.setString("Yes Illegal");
         mycustomstring.convertDigitsToNamesInSubstring(4, 3);
      }
    
    //test to check if out of bound by making the index greater than string size
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("Yes out of bound");
        mycustomstring.convertDigitsToNamesInSubstring(30, 35);
    }
    
    //test to check if out of bound by making the starting point out of bound = 0.
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString("Yes out of bound");
        mycustomstring.convertDigitsToNamesInSubstring(0, 8);
    }
    
    //test to check if out of bound by making the ending point out of bound = 0.
    @Test (expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString("Yes out of bound");
        mycustomstring.convertDigitsToNamesInSubstring(3, 0);
    }

    //test to check if it works with special characters
    @Test
    public void testConvertDigitsToNamesInSubstring7() {
    	mycustomstring.setString("Special$0 9-5 charact3r5 ");
        mycustomstring.convertDigitsToNamesInSubstring(1, 15);
        assertEquals("Special$Zero Nine-Five charact3r5 ", mycustomstring.getString());
    }
    
    //test to check if it works if the string only contains all digits.
    @Test
    public void testConvertDigitsToNamesInSubstring8() {
    	mycustomstring.setString("123456");
        mycustomstring.convertDigitsToNamesInSubstring(1, 6);
        assertEquals("OneTwoThreeFourFiveSix", mycustomstring.getString());
    }

}
