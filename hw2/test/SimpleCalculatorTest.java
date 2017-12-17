import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleCalculatorTest extends HomeworkTestBase {
	@Test
	public void testAdd() {
		SimpleCalculator.main(new String[]{"1", "+", "1"});
		assertEquals("2.0", getOutput());

		clearOutput();
		SimpleCalculator.main(new String[]{"-1", "+", "1"});
		assertEquals("0.0", getOutput());

		clearOutput();
		SimpleCalculator.main(new String[]{"1", "+", "-1"});
		assertEquals("0.0", getOutput());
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator.main(new String[]{"1", "-", "1"});
		assertEquals("0.0", getOutput());

		clearOutput();
		SimpleCalculator.main(new String[]{"1", "-", "-1"});
		assertEquals("2.0", getOutput());
	}

	@Test
	public void testMultiply() {
		SimpleCalculator.main(new String[]{"1.5", "*", "2"});
		assertEquals("3.0", getOutput());		

		clearOutput();
		SimpleCalculator.main(new String[]{"2.0", "*", "5e-1"});
		assertEquals("1.0", getOutput());		

		clearOutput();
		SimpleCalculator.main(new String[]{"0.5", "*", "2"});
		assertEquals("1.0", getOutput());		
	}

	@Test
	public void testDivide() {
		SimpleCalculator.main(new String[]{"1.5", "/", "2"});
		assertEquals("0.75", getOutput());		

		clearOutput();
		SimpleCalculator.main(new String[]{"2.0", "/", "5e-1"});
		assertEquals("4.0", getOutput());		

		clearOutput();
		SimpleCalculator.main(new String[]{"0.5", "/", "2"});
		assertEquals("0.25", getOutput());		
	}

	@Test
	public void testErrors() {
		SimpleCalculator.main(new String[]{"0", "%", "0"});
		assertEquals("Invalid operator", getOutput());
		
		clearOutput();
		SimpleCalculator.main(new String[]{"1", "++", "1"});
		assertEquals("Invalid operator", getOutput());

		clearOutput();
		SimpleCalculator.main(new String[]{"1", "", "1"});
		assertEquals("Invalid operator", getOutput());

		clearOutput();
		SimpleCalculator.main(new String[]{"1", "*/", "1"});
		assertEquals("Invalid operator", getOutput());
	}
}
