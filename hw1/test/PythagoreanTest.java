import static org.junit.Assert.*;

import org.junit.Test;


public class PythagoreanTest extends HomeworkTestBase {

	@Test
	public void test345() {
		Pythagorean.main(new String[] {"3", "4", "5"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test346() {
		Pythagorean.main(new String[] {"3", "4", "6"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test354() {
		Pythagorean.main(new String[] {"3", "5", "4"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test435() {
		Pythagorean.main(new String[] {"4", "3", "5"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test453() {
		Pythagorean.main(new String[] {"4", "5", "3"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test534() {
		Pythagorean.main(new String[] {"5", "3", "4"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test543() {
		Pythagorean.main(new String[] {"5", "4", "3"});
		assertTrue(Boolean.parseBoolean(getOutput()));
	}

	
	
	@Test
	public void test364() {
		Pythagorean.main(new String[] {"3", "6", "4"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test436() {
		Pythagorean.main(new String[] {"4", "3", "6"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test463() {
		Pythagorean.main(new String[] {"4", "6", "3"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test634() {
		Pythagorean.main(new String[] {"6", "3", "4"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

	@Test
	public void test643() {
		Pythagorean.main(new String[] {"6", "4", "3"});
		assertFalse(Boolean.parseBoolean(getOutput()));
	}

}
