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
	static double TOLERANCE = 1e-6;
	
	private PrintStream oldOut = System.out;
	private ByteArrayOutputStream out = new ByteArrayOutputStream();

	private static Random rnd = null;
	
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(out));

		if (rnd != null) {
			return;
		}
		// Hack to set random seed using reflection;
		// see http://stackoverflow.com/questions/2836718
		rnd = new Random();
		try {
		  Field field = null;
		  if (System.getProperty("java.version").startsWith("1.8")) {
			Class<?>[] classes = Math.class.getDeclaredClasses();
			for (Class<?> c : classes) {
				if ("java.lang.Math.RandomNumberGeneratorHolder".equals(c.getCanonicalName())) {
					field = c.getDeclaredField("randomNumberGenerator");
					// From http://stackoverflow.com/questions/2474017
					Field modifiersField = Field.class.getDeclaredField("modifiers");
				    if (!modifiersField.isAccessible()) {
				    	modifiersField.setAccessible(true);
				    }
				    if ((modifiersField.getInt(field) & Modifier.FINAL) != 0) {
				    	modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
				    }
				    break;
				}
			}
		  } else {
		    field = Math.class.getDeclaredField("randomNumberGenerator");
		  }
          field.setAccessible(true);
          field.set(null, rnd);
		} catch (NullPointerException e) {
			fail("Unexpected exception; please notify instructor");
		} catch (NoSuchFieldException e) {
			fail("Unexpected exception; please notify instructor");
		} catch (IllegalAccessException e) {
			System.err.println(e);
			fail("Unexpected exception; please notify instructor");
		}

	}

	@After
	public void tearDown() throws Exception {
		System.setOut(oldOut);
	}
	
	protected void clearOutput() {
		System.out.flush();
		out.reset();
	}
	
	protected void setMathRandomSeed(long seed) {
		rnd.setSeed(seed);
	}
	
	protected String getOutput() {
		return out.toString().trim();
	}
	
	protected BaseMatcher<Double> equalApprox(final double expected) {
		return new BaseMatcher<Double>() {
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
	
	protected BaseMatcher<Integer> lessThan(final int expected) {
	    return new BaseMatcher<Integer>() {
	        @Override
	        public boolean matches(Object obj) {
	            Integer val = (Integer)obj;
	            return val < expected;
	        }
	        @Override
	        public void describeTo(Description description) {
	            description.appendValue(expected);
	        }
	    };
	}

	   protected BaseMatcher<Integer> greaterThan(final int expected) {
	        return new BaseMatcher<Integer>() {
	            @Override
	            public boolean matches(Object obj) {
	                Integer val = (Integer)obj;
	                return val > expected;
	            }
	            @Override
	            public void describeTo(Description description) {
	                description.appendValue(expected);
	            }
	        };
	    }

}
