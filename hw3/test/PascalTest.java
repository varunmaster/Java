import static org.junit.Assert.*;

import org.junit.Test;


public class PascalTest extends HomeworkTestBase {

	protected int[] parseOutput(String output) {
		String[] fields = output.split("\\s+");
		int[] a = new int[fields.length];
		for (int i = 0;  i < fields.length;  i++) {
			a[i] = Integer.parseInt(fields[i]);
		}
		return a;
	}
		
	protected void assertSeqEquals(int[] expected, int[] actual) {
		// Does not check for newline formatting
		assertEquals("Number of elements", expected.length, actual.length);
		for (int i = 0;  i < expected.length; i++) {
			assertEquals("Element [" + i + "]", expected[i], actual[i]);
        }
	}
	 
	@Test
	public void testOne() {
		int[] expected = { 1 };
		Pascal.main(new String[]{"1"});
		assertSeqEquals(expected, parseOutput(getOutput()));
	}

	@Test
	public void testTwo() {
		int[] expected = { 1,
				           1, 1 };
		Pascal.main(new String[]{"2"});
		assertSeqEquals(expected, parseOutput(getOutput()));
	}
	
	@Test
	public void testTen() {
		int[] expected = { 1, 
				1, 1, 
				1, 2, 1, 
				1, 3, 3, 1, 
				1, 4, 6, 4, 1, 
				1, 5, 10, 10, 5, 1, 
				1, 6, 15, 20, 15, 6, 1, 
				1, 7, 21, 35, 35, 21, 7, 1, 
				1, 8, 28, 56, 70, 56, 28, 8, 1, 
				1, 9, 36, 84, 126, 126, 84, 36, 9, 1 
		};
		Pascal.main(new String[]{"10"});
		assertSeqEquals(expected, parseOutput(getOutput()));
	}


}
