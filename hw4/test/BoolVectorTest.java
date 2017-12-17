import static org.junit.Assert.*;

import org.junit.Test;


public class BoolVectorTest {

    protected void assertVectorEquals(boolean[] expected, boolean[] actual) {
    	// Does not check for newline formatting
        assertEquals("Number of elements", expected.length, actual.length);
        for (int i = 0;  i < expected.length; i++) {
        	assertEquals("Element [" + i + "]", expected[i], actual[i]);
        }
    }

	
	@Test
	public void testAll() {
		boolean[] input = new boolean[]{};
		boolean[] v = input.clone();

		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ false };
		v = input.clone();
		assertEquals(false, BoolVector.all(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ true };
		v = input.clone();
		assertEquals(true, BoolVector.all(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ true, false };
		v = input.clone();
		assertEquals(false, BoolVector.all(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ false, true, true };
		v = input.clone();
		assertEquals(false, BoolVector.all(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ true, true, true };
		v = input.clone();
		assertEquals(true, BoolVector.all(v));
		assertVectorEquals(input, v);  // Input vector was unmodified
	}

	@Test
	public void testSome() {
		boolean[] input = new boolean[]{};
		boolean[] v = input.clone();
		assertEquals(false, BoolVector.some(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ false };
		v = input.clone();
		assertEquals(false, BoolVector.some(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ true };
		v = input.clone();
		assertEquals(true, BoolVector.some(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ true, false, false };
		v = input.clone();
		assertEquals(true, BoolVector.some(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ false, true };
		v = input.clone();
		assertEquals(true, BoolVector.some(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{ true, true, true };
		v = input.clone();
		assertEquals(true, BoolVector.some(v));
		assertVectorEquals(input, v);  // Input vector was unmodified
	}

	@Test
	public void testNeg() {
		boolean[] input = new boolean[]{};
		boolean[] expected = new boolean[]{};
		boolean[] v = input.clone();
		assertVectorEquals(expected, BoolVector.neg(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{true};
		expected = new boolean[]{false};
		v = input.clone();
		assertVectorEquals(expected, BoolVector.neg(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{false};
		expected = new boolean[]{true};
		v = input.clone();
		assertVectorEquals(expected, BoolVector.neg(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

		input = new boolean[]{true, false, false};
		expected = new boolean[]{false, true, true};
		v = input.clone();
		assertVectorEquals(expected, BoolVector.neg(v));
		assertVectorEquals(input, v);  // Input vector was unmodified

	}

	@Test
	public void testAnd() {
		boolean[] input1 = new boolean[]{};
		boolean[] input2 = new boolean[]{};
		boolean[] expected = new boolean[]{};
		boolean[] v1 = input1.clone(), v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.and(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{};
		input2 = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertEquals(null, BoolVector.and(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{false, true};
		input2 = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertEquals(null, BoolVector.and(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{true};
		input2 = new boolean[]{true};
		expected = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.and(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{true, false, true, false};
		input2 = new boolean[]{true, false, false, true};
		expected = new boolean[]{true, false, false, false};
		v1 = input1.clone();
		v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.and(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified
	}
	
	@Test
	public void testOr() {
		boolean[] input1 = new boolean[]{};
		boolean[] input2 = new boolean[]{};
		boolean[] expected = new boolean[]{};
		boolean[] v1 = input1.clone(), v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.or(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{};
		input2 = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertEquals(null, BoolVector.or(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{false, true};
		input2 = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertEquals(null, BoolVector.or(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{true};
		input2 = new boolean[]{true};
		expected = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.or(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{true, false, true, false};
		input2 = new boolean[]{true, false, false, true};
		expected = new boolean[]{true, false, true, true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.or(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

	}

	@Test
	public void testXor() {
		boolean[] input1 = new boolean[]{};
		boolean[] input2 = new boolean[]{};
		boolean[] expected = new boolean[]{};
		boolean[] v1 = input1.clone(), v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.xor(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{};
		input2 = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertEquals(null, BoolVector.xor(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{false, true};
		input2 = new boolean[]{true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertEquals(null, BoolVector.xor(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{true};
		input2 = new boolean[]{true};
		expected = new boolean[]{false};
		v1 = input1.clone();
		v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.xor(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

		input1 = new boolean[]{true, false, true, false};
		input2 = new boolean[]{true, false, false, true};
		expected = new boolean[]{false, false, true, true};
		v1 = input1.clone();
		v2 = input2.clone();
		assertVectorEquals(expected, BoolVector.xor(v1, v2));
		assertVectorEquals(input1, v1);  // Input vector was unmodified
		assertVectorEquals(input2, v2);  // Input vector was unmodified

	}

}
