import static org.junit.Assert.*;

import org.junit.Test;


public class ParseIntTest {

    @Test
    public void testDigits() {
        assertEquals(0, ParseInt.parseInt("0"));
        assertEquals(1, ParseInt.parseInt("1"));
        assertEquals(2, ParseInt.parseInt("2"));
        assertEquals(3, ParseInt.parseInt("3"));
        assertEquals(4, ParseInt.parseInt("4"));
        assertEquals(5, ParseInt.parseInt("5"));
        assertEquals(6, ParseInt.parseInt("6"));
        assertEquals(7, ParseInt.parseInt("7"));
        assertEquals(8, ParseInt.parseInt("8"));
        assertEquals(9, ParseInt.parseInt("9"));
    }
    
    @Test
    public void testLeadingZeros() {
        assertEquals(0, ParseInt.parseInt("000"));
        assertEquals(12, ParseInt.parseInt("012"));
        assertEquals(120, ParseInt.parseInt("0120"));
    }

    @Test
    public void testAll() {
        for (int i = 0;  i < (Integer.MAX_VALUE-1)/3; i = i*3 + 1) {
            assertEquals(i, ParseInt.parseInt(Integer.toString(i)));
        }
    }

}
