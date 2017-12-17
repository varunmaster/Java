import static org.junit.Assert.*;

import org.junit.Test;


public class PrefixSumTest {
	
    protected void assertArrayEquals(int[] expected, int[] actual) {
    	// Does not check for newline formatting
        assertEquals("Number of elements", expected.length, actual.length);
        for (int i = 0;  i < expected.length; i++) {
        	assertEquals("Element [" + i + "]", expected[i], actual[i]);
        }
    }

    protected void assertMatrixEquals(int[][] expected, int[][] actual, boolean identical) {
        assertEquals("Number of rows", expected.length, actual.length);
        for (int i = 0;  i < expected.length; i++) {
            assertEquals("Number of columns for " + i + "th row", expected[i].length, actual[i].length);
            if (identical) {
            	assertEquals(expected[i], actual[i]);  // No rows have been switched, even if to equal rows
            }
            for (int j = 0;  j < expected[i].length; j++) {
                assertEquals("Element [" + i + "][" + j + "]", expected[i][j], actual[i][j]);
            }
        }
    }
    
    protected void assertMatrixEquals(int[][] expected, int[][] actual) {
    	assertMatrixEquals(expected, actual, false);
    }
    
	@Test
	public void testEmpty() {
		int[] input = {};
		int[] expected = {};
		int[] a = input.clone();
		int[] s = PrefixSum.prefixSum(a);
		assertArrayEquals(input, a);  // Input array was unmodified
		assertArrayEquals(expected, s);
	}

	@Test
	public void testSingleton() {
		int[] input = {10};
		int[] expected = {10};
		int[] a = input.clone();
		int[] s = PrefixSum.prefixSum(a);
		assertArrayEquals(input, a);  // Input array was unmodified
		assertArrayEquals(expected, s);
	}

	@Test
	public void testShort() {
		int[] input = {1, 5, 10, 2, 1, 5};
		int[] expected = {1, 6, 16, 18, 19, 24};
		int[] a = input.clone();
		int[] s = PrefixSum.prefixSum(a);
		assertArrayEquals(input, a);  // Input array was unmodified
		assertArrayEquals(expected, s);
	}

	@Test
	public void testShortNegative() {
		int[] input = {0, -1, -5, 8, -5, 12, 3};
		int[] expected = {0, -1, -6, 2, -3, 9, 12};
		int[] a = input.clone();
		int[] s = PrefixSum.prefixSum(a);
		assertArrayEquals(input, a);  // Input array was unmodified
		assertArrayEquals(expected, s);
	}
	
	@Test
	public void testSingleton2D() {
		int[][] input = { {10} };
		int[][] expected = { {10} };
		int[][] a = input.clone();
		int[][] s = PrefixSum.prefixSum(a);
		assertMatrixEquals(input, a, true);  // Input array was unmodified
		assertMatrixEquals(expected, s);
	}

	@Test
	public void testSquare2D() {
		int[][] input = { {10, 20, 30},
				          { 1, -2,  3},
				          { -3, 5,  7}};
		int[][] expected = { {10, 30, 60},
				             {11, 29, 62},
				             { 8, 31, 71} };
		int[][] a = input.clone();
		int[][] s = PrefixSum.prefixSum(a);
		assertMatrixEquals(input, a, true);  // Input array was unmodified
		assertMatrixEquals(expected, s);
	}

	@Test
	public void testThin2D() {
		int[][] input = { {10, 20, 30},
				          { 1, -2,  3},
				          {-3,  5,  7},
				          { 3,  2,  1} };
		int[][] expected = { {10, 30, 60},
				             {11, 29, 62},
				             { 8, 31, 71},
				             {11, 36, 77} };
		int[][] a = input.clone();
		int[][] s = PrefixSum.prefixSum(a);
		assertMatrixEquals(input, a, true);  // Input array was unmodified
		assertMatrixEquals(expected, s);
	}

	@Test
	public void testFat2D() {
		int[][] input = { {10, 20, 30, 5},
				          { 1, -2,  3, 4},
				          { -3, 5,  7, 6}};
		int[][] expected = { {10, 30, 60, 65},
				             {11, 29, 62, 71},
				             { 8, 31, 71, 86} };
		int[][] a = input.clone();
		int[][] s = PrefixSum.prefixSum(a);
		assertMatrixEquals(input, a, true);  // Input array was unmodified
		assertMatrixEquals(expected, s);
	}

}
