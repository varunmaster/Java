import static org.junit.Assert.*;

public class LongestPlateauTestBase extends HomeworkTestBase {

    protected void assertEqualsPair(int expectedOffset, int expectedLength, String output) {
        String[] tokens = output.split("\\s+");
        assertEquals("Numbers in output", 2, tokens.length);
        assertEquals("Offset", expectedOffset, Integer.parseInt(tokens[0]));
        assertEquals("Length", expectedLength, Integer.parseInt(tokens[1]));
    }
    
    protected void assertEqualsNone(String output) {
        assertEquals("None", output);
    }
}
