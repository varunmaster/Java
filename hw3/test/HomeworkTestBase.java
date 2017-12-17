import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
	
	protected void clearOutput() {
		System.out.flush();
		out.reset();
	}
	
	private static Field rndField;
	private static Method setSeedMethod;
	
	static {
		// Hack to set random seed using reflection;
		// see http://stackoverflow.com/questions/2836718
		try {
		  if (System.getProperty("java.version").startsWith("1.8")) {
			Class<?>[] classes = Math.class.getDeclaredClasses();
			for (Class<?> c : classes) {
				if ("java.lang.Math.RandomNumberGeneratorHolder".equals(c.getCanonicalName())) {
					rndField = c.getDeclaredField("randomNumberGenerator");
					// From http://stackoverflow.com/questions/2474017
					Field modifiersField = Field.class.getDeclaredField("modifiers");
				    modifiersField.setAccessible(true);
				    modifiersField.setInt(rndField, rndField.getModifiers() & ~Modifier.FINAL);
					break;
				}
			}
		  } else {
		    rndField = Math.class.getDeclaredField("randomNumberGenerator");
		  }
          rndField.setAccessible(true);
          setSeedMethod = Random.class.getMethod("setSeed", Long.TYPE);
		} catch (NullPointerException e) {
			fail("Unexpected exception; please notify instructor");
		} catch (NoSuchFieldException e) {
			fail("Unexpected exception; please notify instructor");
		} catch (NoSuchMethodException e) {
			System.err.println(e);
			fail("Unexpected exception; please notify instructor");
		} catch (IllegalAccessException e) {
			System.err.println(e);
			fail("Unexpected exception; please notify instructor");
		}		
	}
	
	protected static void setMathRandomSeed(long seed) {
		try {
			//rndField.set(null, new Random(seed));
			//Random r = new Random(); r.setSeed(seed);
			setSeedMethod.invoke(rndField.get(null), seed);
		} catch (InvocationTargetException e) {
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
