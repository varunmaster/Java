import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeCounterTest extends HomeworkTestBase {

	@Test
	public void testOne() {
		PrimeCounter.main(new String[]{"1"});
		assertEquals("1", getOutput());
	}

	@Test
	public void testTen() {
		PrimeCounter.main(new String[]{"10"});
		assertEquals("5", getOutput());		
	}
	
	@Test
	public void testOther() {
		PrimeCounter.main(new String[]{"25"});
		assertEquals("10", getOutput());
		clearOutput();
		PrimeCounter.main(new String[]{"100"});
		assertEquals("26", getOutput());
		clearOutput();
		PrimeCounter.main(new String[]{"1000"});
		assertEquals("169", getOutput());
		clearOutput();
		PrimeCounter.main(new String[]{"10000"});
		assertEquals("1230", getOutput());
		clearOutput();
	}
}
