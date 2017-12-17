import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class ShuffleCheckTest extends HomeworkTestBase {

    private int[][] parseMatrix(String output, int dim) {
        int[][] a = new int[dim][dim];
        String[] tokens = output.split("\\s+");
        assertEquals("Output size", dim*dim, tokens.length);
        int p = 0;
        for (int i = 0;  i < dim;  i++) {
            for (int j = 0;  j < dim;  j++) {
                a[i][j] = Integer.parseInt(tokens[p]);
                ++p;
            }
        }
        return a;
    }
    
    private void assertMatrixEquals(int[][] expected, int[][] actual) {
        assertEquals("Number of rows", expected.length, actual.length);
        for (int i = 0;  i < expected.length; i++) {
            assertEquals("Number of columns for " + i + "th row", expected[i].length, actual[i].length);
            for (int j = 0;  j < expected[i].length; j++) {
                assertEquals("Element [" + i + "][" + j + "]", expected[i][j], actual[i][j]);
            }
        }
    }
    
	@BeforeClass
	public static void setup() {
		setMathRandomSeed(666L);
	}

    @Test
    public void testOne() {
        int[][] expected = {
                { 101, 86, 99, 100, 113, 88, 115, 103, 90, 105 },
                {  99, 107, 94, 120, 108, 92, 94, 91, 110, 85 },
                { 103, 94, 104, 99, 102, 107, 110, 96, 92, 93 },
                { 125, 106, 89, 104, 83, 96, 94, 101, 104, 98 },
                { 109, 87, 109, 107, 95, 111, 95, 99, 89, 99 },
                {  87, 112, 92, 91, 97, 101, 111, 99, 117, 93 },
                {  92, 121, 97, 93, 98, 105, 97, 96, 109, 92 },
                {  87, 106, 112, 98, 92, 111, 88, 106, 86, 114 },
                {  88, 93, 113, 100, 96, 100, 101, 102, 95, 112 },
                { 109, 88, 91, 88, 116, 89, 95, 107, 108, 109 },
        	
                //{ 102, 93, 94, 108, 108, 89, 106, 89, 98, 113, },
                //{ 100, 104, 107, 105, 107, 100, 88, 101, 107, 81 },
                //{ 104, 101, 91, 95, 100, 108, 107, 99, 97, 98 },
                //{ 92, 120, 87, 92, 89, 104, 105, 99, 111, 101 },
                //{ 92, 101, 93, 109, 113, 94, 97, 94, 90, 117 },
                //{ 96, 107, 93, 96, 112, 99, 109, 99, 98, 91 },
                //{ 106, 90, 111, 103, 95, 101, 89, 97, 112, 96 },
                //{ 88, 103, 99, 93, 98, 97, 115, 117, 91, 99, },
                //{ 107, 97, 114, 86, 85, 94, 88, 101, 115, 113 },
                //{ 113, 84, 111, 113, 93, 114, 96, 104, 81, 91 },
        };
        //setMathRandomSeed(666L);
        ShuffleCheck.main(new String[]{"10", "1000"});
        assertMatrixEquals(expected, parseMatrix(getOutput(), 10));
    }
    
    @Test
    public void testTwo() {
        int[][] expected = {
                { 2501, 2518, 2507, 2474 },
                { 2514, 2439, 2477, 2570 },
                { 2481, 2491, 2502, 2526 },
                { 2504, 2552, 2514, 2430 },
        		
        //		{ 2467, 2549, 2496, 2488 },
        //		{ 2522, 2450, 2458, 2570 },
        //		{ 2506, 2529, 2491, 2474 },
        //		{ 2505, 2472, 2555, 2468 }, 
        };
        //setMathRandomSeed(999L);
        ShuffleCheck.main(new String[]{"4", "10000"});
        assertMatrixEquals(expected, parseMatrix(getOutput(), 4));        
    }

}
