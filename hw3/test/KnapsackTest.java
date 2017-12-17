import static org.junit.Assert.*;

import org.junit.Test;


public class KnapsackTest extends HomeworkTestBase {

	@Test
	public void testSimple() {
		Knapsack.main(new String[]{"10", "1", "20"});
		assertEquals(200, Integer.parseInt(getOutput()));

		clearOutput();
		Knapsack.main(new String[]{"10", "2", "1", "20", "20"});
		assertEquals(200, Integer.parseInt(getOutput()));

		clearOutput();
		Knapsack.main(new String[]{"10", "3", "1", "35", "10"});
		assertEquals(115, Integer.parseInt(getOutput()));
	}

	@Test
	public void testSimpleDup() {
		Knapsack.main(new String[]{"10", "1", "1", "20", "25"});
		assertEquals(250, Integer.parseInt(getOutput()));

	}
	
	@Test
	public void testSmallInstance() {
		Knapsack.main(new String[]{"9", "2", "5", "7", "10", "60", "90"});
		assertEquals(100, Integer.parseInt(getOutput()));
		
		clearOutput();
		Knapsack.main(new String[]{"10", "2", "5", "7", "10", "60", "90"});
		assertEquals(120, Integer.parseInt(getOutput()));
	}

}
