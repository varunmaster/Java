import static org.junit.Assert.*;

import org.junit.Test;


public class TwoSortTest extends HomeworkTestBase {

	@Test
	public void test1() {
		TwoSort.main(new String[] {"1", "1"});
		String[] fields = getOutput().split("\\s+");
		assertEquals(2, fields.length);
		assertEquals(1, Integer.parseInt(fields[0]));
		assertEquals(1, Integer.parseInt(fields[1]));
	}

	@Test
	public void testNeg1a() {
		TwoSort.main(new String[] {"1", "-1"});
		String[] fields = getOutput().split("\\s+");
		assertEquals(2, fields.length);
		assertEquals(-1, Integer.parseInt(fields[0]));
		assertEquals(1, Integer.parseInt(fields[1]));
	}

	@Test
	public void testNeg1b() {
		TwoSort.main(new String[] {"-1", "1"});
		String[] fields = getOutput().split("\\s+");
		assertEquals(2, fields.length);
		assertEquals(-1, Integer.parseInt(fields[0]));
		assertEquals(1, Integer.parseInt(fields[1]));
	}

	@Test
	public void test2() {
		TwoSort.main(new String[] {"10", "1"});
		String[] fields = getOutput().split("\\s+");
		assertEquals(2, fields.length);
		assertEquals(1, Integer.parseInt(fields[0]));
		assertEquals(10, Integer.parseInt(fields[1]));
	}

	@Test
	public void test3() {
		TwoSort.main(new String[] {"1", "12"});
		String[] fields = getOutput().split("\\s+");
		assertEquals(2, fields.length);
		assertEquals(1, Integer.parseInt(fields[0]));
		assertEquals(12, Integer.parseInt(fields[1]));
	}

}
