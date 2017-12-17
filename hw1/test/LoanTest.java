import static org.junit.Assert.*;

import org.junit.Test;


public class LoanTest extends HomeworkTestBase {
    // t P r
	
	@Test
	public void test1() {
		Loan.main(new String[] {"10", "100", "0.05"});
		assertEquals(1.3739343922501068, Double.parseDouble(getOutput()), TOLERANCE);
	}

	@Test
	public void test2() {
		Loan.main(new String[] {"1", "100", "0.05"});
		assertEquals(8.760592469800201, Double.parseDouble(getOutput()), TOLERANCE);
	}

	@Test
	public void test3() {
		Loan.main(new String[] {"1", "500", "0.01"});
		assertEquals(42.085423628506994, Double.parseDouble(getOutput()), TOLERANCE);
	}

	@Test
	public void testZero() {
		Loan.main(new String[] {"10", "0", "0.05"});
		assertEquals(0.0, Double.parseDouble(getOutput()), TOLERANCE);
	}

}
