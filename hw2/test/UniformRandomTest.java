import static org.junit.Assert.*;

import org.junit.Test;


public class UniformRandomTest extends HomeworkTestBase{
	private class Triple {
		final public double avg;
		final public double min;
		final public double max;
		
		Triple(double avg, double min, double max) {
			this.avg = avg;
			this.min = min;
			this.max = max;
		}
		
		Triple(String output) {
			String[] tokens = output.split("\\s+");
			avg = Double.parseDouble(tokens[0]);
			min = Double.parseDouble(tokens[1]);
			max = Double.parseDouble(tokens[2]);
		}
		
		void assertEqualsApprox(Triple expected) {
			assertEquals("Average", expected.avg, avg, TOLERANCE);
			assertEquals("Minimum", expected.min, min, TOLERANCE);
			assertEquals("Maximum", expected.max, max, TOLERANCE);
		}
	}
	
	@Test
	public void testFive() {
		final Triple expectedResult =
				new Triple(0.5962387516591026, 
						   0.19497605734770518, 
						   0.7784408674101491);
		setMathRandomSeed(100L);

		UniformRandom.main(new String[]{"5"});
		Triple result = new Triple(getOutput());
		result.assertEqualsApprox(expectedResult);
	}

	@Test
	public void testHundred() {
		final Triple expectedResult = 
				new Triple(0.48756212896032813,
						   0.00979691124902185,
						   0.9911900648591906);
		setMathRandomSeed(500L);

		UniformRandom.main(new String[]{"100"});
		Triple result = new Triple(getOutput());
		result.assertEqualsApprox(expectedResult);
	}
	
	@Test
	public void testFiveThousand() {
		final Triple expectedResult =
				new Triple(0.5038797865335103,
						   1.0882945968704316E-4, 
						   0.999952282683081);
		setMathRandomSeed(800L);

		UniformRandom.main(new String[]{"5000"});
		Triple result = new Triple(getOutput());
		result.assertEqualsApprox(expectedResult);
	}
}
