import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest extends HomeworkTestBase {
	
	@Test
	public void testIdentity1() {
		Multiply.main(new String[] {"1", "2"});
		double result = Double.parseDouble(getOutput());
		assertThat(result, equalApprox(2.0));
	}
	
	@Test
	public void testIdentity2() {
		Multiply.main(new String[] {"1", "2.5"});
		double result = Double.parseDouble(getOutput());
		assertThat(result, equalApprox(2.5));
	}
	
	@Test
	public void testNegative() {
		Multiply.main(new String[]{"-3.5", "2"});
		double result = Double.parseDouble(getOutput());
		assertThat(result, equalApprox(-7.0));
	}
	
	@Test
	public void testZero1() {
		Multiply.main(new String[]{"0", "2"});
		double result = Double.parseDouble(getOutput());
		assertThat(result, equalApprox(0.0));
	}

	@Test
	public void testZero2() {
		Multiply.main(new String[]{"123", "0.0"});
		double result = Double.parseDouble(getOutput());
		assertThat(result, equalApprox(0.0));
	}

	@Test
	public void testZero3() {
		Multiply.main(new String[]{"-0", "0.0"});
		double result = Double.parseDouble(getOutput());
		assertThat(result, equalApprox(-0.0));
	}
}
