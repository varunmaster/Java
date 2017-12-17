import org.junit.Test;

public class LongestPlateauTest extends LongestPlateauTestBase {

    @Test
    public void testSimple() {
        LongestPlateau.main(new String[] {"1", "2", "2", "2", "2", "5", "5", "5", "3"});
        assertEqualsPair(5, 3, getOutput());
    }

    @Test
    public void testNone() {
        LongestPlateau.main(new String[] {"1", "2", "3", "4"});
        assertEqualsPair(3, 1, getOutput());
    }
}
