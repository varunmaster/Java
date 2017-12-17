import static org.junit.Assert.*;

import org.junit.Test;


public class OrderCheckTest extends HomeworkTestBase {

	@Test
	public void testAllEqual() {
		OrderCheck.main(new String[] {"1", "1", "1"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void testFirstTwoEqual() {
		OrderCheck.main(new String[] {"1", "1", "2"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void testLastTwoEqual() {
		OrderCheck.main(new String[] {"1", "2", "2"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void testAscending() {
		OrderCheck.main(new String[] {"-1", "2", "13"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void testDescending() {
		OrderCheck.main(new String[] {"12", "2", "1"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void testUnordered() {
		OrderCheck.main(new String[] {"2", "1", "3"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

}
