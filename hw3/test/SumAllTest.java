import static org.junit.Assert.*;

import org.junit.Test;


public class SumAllTest extends HomeworkTestBase {

    @Test
    public void testNoArguments() {
        SumAll.main(new String[]{});
        assertEquals(0.0, Double.parseDouble(getOutput()), TOLERANCE);
    }

    @Test
    public void testOneArgument() {
        SumAll.main(new String[]{"1.5"});
        assertEquals(1.5, Double.parseDouble(getOutput()), TOLERANCE);
    }

    @Test
    public void testPositiveArguments() {
        SumAll.main(new String[]{"1.5", "0.5", "0.25", "0.1"});
        assertEquals(2.35, Double.parseDouble(getOutput()), TOLERANCE);
    }

    @Test
    public void testMixedArguments() {
        SumAll.main(new String[]{"-0.5", "1.5", "-0.25", "0.1"});
        assertEquals(0.85, Double.parseDouble(getOutput()), TOLERANCE);
    }

}
