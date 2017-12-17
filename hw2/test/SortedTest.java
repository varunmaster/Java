import static org.junit.Assert.*;

import org.junit.Test;


public class SortedTest extends HomeworkTestBase {

	@Test
	public void testEmpty() {
		Sorted.main(new String[]{});
		assertEquals("Ascending", getOutput());
	}

	@Test
	public void testSingle() {
		Sorted.main(new String[]{"1"});
		assertEquals("Ascending", getOutput());
	}
	
	@Test
	public void testPair() {
		Sorted.main(new String[]{"1", "1"});
		assertEquals("Ascending", getOutput());
		clearOutput();
		Sorted.main(new String[]{"1", "2"});
		assertEquals("Ascending", getOutput());
		clearOutput();
		Sorted.main(new String[]{"2", "1"});
		assertEquals("Descending", getOutput());		
	}
	
	@Test
	public void testTriple() {
		Sorted.main(new String[]{"1", "1", "1"});
		assertEquals("Ascending", getOutput());
		clearOutput();
		Sorted.main(new String[]{"1", "2", "2"});
		assertEquals("Ascending", getOutput());		
		clearOutput();
		Sorted.main(new String[]{"1", "1", "2"});
		assertEquals("Ascending", getOutput());		
		clearOutput();
		Sorted.main(new String[]{"2", "1", "1"});
		assertEquals("Descending", getOutput());				
		clearOutput();
		Sorted.main(new String[]{"2", "1", "2"});
		assertEquals("Unsorted", getOutput());				
	}
	
	@Test
	public void testFirstOutOfOrder() {
		Sorted.main(new String[]{"2", "1", "2", "3", "4"});
		assertEquals("Unsorted", getOutput());
	}

	@Test
	public void testLastOutOfOrder() {
		Sorted.main(new String[]{"1", "2", "3", "4", "3"});
		assertEquals("Unsorted", getOutput());
	}

	@Test
	public void testMiddleOutOfOrder() {
		Sorted.main(new String[]{"1", "2", "3", "2", "3", "4"});
		assertEquals("Unsorted", getOutput());
	}

}
