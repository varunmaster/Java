import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.BeforeClass;

public class RumorsTest extends HomeworkTestBase {
	
	@BeforeClass
	public static void setup() {
		setMathRandomSeed(666L);
	}

	@Test
	public void testBob() {
        //setMathRandomSeed(666L);
		Rumors.main(new String[]{"1", "100"});
		String[] fields = getOutput().split("\\s+");
		double probability = Double.parseDouble(fields[0]);
		double expectation = Double.parseDouble(fields[1]);
		assertEquals(1.0, probability, TOLERANCE);
		assertEquals(1.0, expectation, TOLERANCE);
	}
	
	@Test
	public void testBobAndUncle() {
        //setMathRandomSeed(666L);
		Rumors.main(new String[]{"2", "100"});
		String[] fields = getOutput().split("\\s+");
		double probability = Double.parseDouble(fields[0]);
		double expectation = Double.parseDouble(fields[1]);
		assertEquals(1.0, probability, TOLERANCE);
		assertEquals(2.0, expectation, TOLERANCE);
	}

	@Test
	public void testBobAndUncles() {
        //setMathRandomSeed(666L);
		Rumors.main(new String[]{"3", "100"});
		String[] fields = getOutput().split("\\s+");
		double probability = Double.parseDouble(fields[0]);
		double expectation = Double.parseDouble(fields[1]);
		assertEquals(1.0, probability, TOLERANCE);
		assertEquals(3.0, expectation, TOLERANCE);
	}

	// testFour and testTen consider this possible
	//    alternative implementations (non-exhaustive)
	// 1) Bob <- N-1 & explicitly terminate when all know
	// 2) Bob <- N-1 & terminate only when next person knows
	// 3) Bob <- 0   & explicitly terminate when all know
	// 4) Bob <- 0   & terminate only when next person knows
	//
	// NOTE: testFour has eight alternatives, since outcome
	//    depends on whether testTen was previously run or not
	//
	// TODO - Properly check for (probability, expectation) pair
	//    equality, rather than each var independently

	@Test
	public void testFour() {
        //setMathRandomSeed(666L);
		Rumors.main(new String[]{"4", "100"});
		String[] fields = getOutput().split("\\s+");
		double probability = Double.parseDouble(fields[0]);
		double expectation = Double.parseDouble(fields[1]);
		//assertEquals(0.46, probability, TOLERANCE);
		//assertEquals(3.46, expectation, TOLERANCE);
		assertThat(probability, anyOf(equalApprox(0.48), equalApprox(0.44), equalApprox(0.52), equalApprox(0.51), equalApprox(0.42), equalApprox(0.46), equalApprox(0.54), equalApprox(0.57) ));
		assertThat(expectation, anyOf(equalApprox(3.48), equalApprox(3.44), equalApprox(3.52), equalApprox(3.51), equalApprox(3.42), equalApprox(3.46), equalApprox(3.54), equalApprox(3.57) ));
		
		clearOutput();
		Rumors.main(new String[]{"4", "10000"});
		fields = getOutput().split("\\s+");
		probability = Double.parseDouble(fields[0]);
		expectation = Double.parseDouble(fields[1]);
		//assertEquals(0.5016, probability, TOLERANCE);
		//assertEquals(3.5016, expectation, TOLERANCE);
		// Alternatives considered (in order):
		assertThat(probability, anyOf(equalApprox(0.5008), equalApprox(0.5013), equalApprox(0.4992), equalApprox(0.4984), equalApprox(0.4999), equalApprox(0.5016), equalApprox(0.5031), equalApprox(0.5076) ));
		assertThat(expectation, anyOf(equalApprox(3.5008), equalApprox(3.5013), equalApprox(3.4992), equalApprox(3.4984), equalApprox(3.4999), equalApprox(3.5016), equalApprox(3.5031), equalApprox(3.5076) ));
	}

	@Test
	public void testTen() {
        //setMathRandomSeed(666L);
		Rumors.main(new String[]{"10", "10000"});
		String[] fields = getOutput().split("\\s+");
		double probability = Double.parseDouble(fields[0]);
		double expectation = Double.parseDouble(fields[1]);
		//assertEquals(0.0027, probability, TOLERANCE);
		//assertEquals(5.2603, expectation, TOLERANCE);
		assertThat(probability, anyOf(equalApprox(0.0027), equalApprox(0.002), equalApprox(0.0028) ));
		assertThat(expectation, anyOf(equalApprox(5.2603), equalApprox(5.2314), equalApprox(5.2605) ));
	}
}
