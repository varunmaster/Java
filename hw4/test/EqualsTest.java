import static org.junit.Assert.*;

import org.junit.Test;


public class EqualsTest {

    @Test
    public void testEmpty() {
        assertTrue(Equals.eq(new int[]{}, new int[]{}));
        assertFalse(Equals.eq(new int[]{}, new int[]{1, 2}));
        assertFalse(Equals.eq(new int[]{1, 2}, new int[]{}));
    }
    
    @Test
    public void testSingleton() {
        assertTrue(Equals.eq(new int[]{1}, new int[]{1}));
        assertFalse(Equals.eq(new int[]{1}, new int[]{1,1}));
        assertFalse(Equals.eq(new int[]{1,1}, new int[]{1}));
    }
    
    public void testLong() {
        assertTrue(Equals.eq(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertFalse(Equals.eq(new int[]{1, 2, 3}, new int[]{1, 3, 2}));
        assertFalse(Equals.eq(new int[]{1, 2, 4, 3}, new int[]{1, 2, 5, 3}));
        assertFalse(Equals.eq(new int[]{1, 2, 3}, new int[]{1, 2}));
        assertFalse(Equals.eq(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
