import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Random;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.fail;

public class HomeworkTestBase {
	static double TOLERANCE = 1e-5;
	
	private PrintStream oldOut = System.out;
	private ByteArrayOutputStream out = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(out));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(oldOut);
	}
	
	protected void setMathRandomSeed(long seed) {
		// Hack to set random seed using reflection;
		// see http://stackoverflow.com/questions/2836718
		try {
		  Field field = null;
		  if (System.getProperty("java.version").startsWith("1.8")) {
			Class<?>[] classes = Math.class.getDeclaredClasses();
			for (Class<?> c : classes) {
				if ("java.lang.Math.RandomNumberGeneratorHolder".equals(c.getCanonicalName())) {
					field = c.getDeclaredField("randomNumberGenerator");
					// From http://stackoverflow.com/questions/2474017
					Field modifiersField = Field.class.getDeclaredField("modifiers");
				    modifiersField.setAccessible(true);
				    modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
					break;
				}
			}
		  } else {
		    field = Math.class.getDeclaredField("randomNumberGenerator");
		  }
          field.setAccessible(true);
          field.set(null, new Random(seed));
		} catch (NullPointerException e) {
			fail("Unexpected exception; please notify instructor");
		} catch (NoSuchFieldException e) {
			fail("Unexpected exception; please notify instructor");
		} catch (IllegalAccessException e) {
			System.err.println(e);
			fail("Unexpected exception; please notify instructor");
		}
	}
	
	protected String getOutput() {
		return out.toString().trim();
	}
	
	protected BaseMatcher<Double> equalApprox(final double value) {
		return new BaseMatcher<Double>() {
			private double expected = value;
			@Override
			public boolean matches(Object obj) {
				Double val = (Double)obj;
				return Math.abs(val-expected) < TOLERANCE;
			}
			@Override
			public void describeTo(Description description) {
				description.appendValue(expected);
			}
			
		};
	}
}
