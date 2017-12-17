import static org.junit.Assert.*;

import org.junit.Test;


public class CardValidateTest extends HomeworkTestBase {

	@Test
	public void testValid() {
		CardValidate.main(new String[]{"2543210987654329"});
		assertEquals("Valid", getOutput());
		
		clearOutput();
		CardValidate.main(new String[]{"4556737586899855"});
		assertEquals("Valid", getOutput());
		
		clearOutput();
		CardValidate.main(new String[]{"5359080289799494"});
		assertEquals("Valid", getOutput());
	}

	@Test
	public void testInvalid() {
		CardValidate.main(new String[]{"2543210987654321"});
		assertEquals("Invalid", getOutput());
		
		clearOutput();
		CardValidate.main(new String[]{"4456737586899855"});
		assertEquals("Invalid", getOutput());

		clearOutput();
		CardValidate.main(new String[]{"6359080289799494"});
		assertEquals("Invalid", getOutput());
	}

	
}
