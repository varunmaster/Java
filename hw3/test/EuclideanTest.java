import static org.junit.Assert.*;

import org.junit.Test;


public class EuclideanTest extends HomeworkTestBase {

	@Test
	public void testNoArguments() {
		Euclidean.main(new String[]{});
		assertEquals(0.0, Double.parseDouble(getOutput()), TOLERANCE);
		// This should be achieved without special case handling
	}
	
	@Test
	public void testLine() {
		Euclidean.main(new String[]{"0"});
		assertEquals(0.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"2.0"});
		assertEquals(2.0, Double.parseDouble(getOutput()), TOLERANCE);
		
		clearOutput();
		Euclidean.main(new String[]{"-3.0"});
		assertEquals(3.0, Double.parseDouble(getOutput()), TOLERANCE);
	}

	@Test
	public void testPlane() {
		Euclidean.main(new String[]{"0.0", "0"});
		assertEquals(0.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"0.0", "2.0"});
		assertEquals(2.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"-2.0", "0.0"});
		assertEquals(2.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"0.0", "-3.0"});
		assertEquals(3.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"3.0", "0.0"});
		assertEquals(3.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"3.0", "4.0"});
		assertEquals(5.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"-3.0", "4.0"});
		assertEquals(5.0, Double.parseDouble(getOutput()), TOLERANCE);

		clearOutput();
		Euclidean.main(new String[]{"4.0", "-3.0"});
		assertEquals(5.0, Double.parseDouble(getOutput()), TOLERANCE);
		
		clearOutput();
		Euclidean.main(new String[]{"1.0", "-1.0"});
		assertEquals(Math.sqrt(2), Double.parseDouble(getOutput()), TOLERANCE);
	}

}
