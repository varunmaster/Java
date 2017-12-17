import static org.junit.Assert.*;

import org.junit.Test;


public class CollinearTest {

    @Test
    public void testTriple() {
        assertTrue(Collinear.collinear(1.0, 1.0, 2.0, 2.0, 3.0, 3.0));
        assertTrue(Collinear.collinear(0.0, 0.0, 1.0, 1.0, -1.0, -1.0));
        assertFalse(Collinear.collinear(0.0, 0.0, 2.0, 3.0, 1.0, 1.0));
    }
    
    @Test
    public void testEqual() {
        assertTrue(Collinear.collinear(0.0, 0.0, 0.0, 0.0, 0.0, 0.0));

        assertTrue(Collinear.collinear(1.0, 1.0, 0.0, 0.0, 0.0, 0.0));
        assertTrue(Collinear.collinear(0.0, 0.0, 1.0, 1.0, 0.0, 0.0));
        assertTrue(Collinear.collinear(0.0, 0.0, 0.0, 0.0, 1.0, 1.0));
    }

    @Test
    public void testAxisParallel() {
        assertTrue(Collinear.collinear(0.0, 0.0, 0.0, 1.0, 0.0, -1.0));
        assertTrue(Collinear.collinear(1.0, 0.0, 1.0, 0.0, -1.0, 0.0));
    }
    
    @Test
    public void testArrayWithTriples() {
        // Same as triple above
        assertTrue(Collinear.collinear(new double[][] {{1.0, 1.0}, {2.0, 2.0}, {3.0, 3.0}}));
        assertTrue(Collinear.collinear(new double[][]{{0.0, 0.0}, {1.0, 1.0}, {-1.0, -1.0}}));
        assertFalse(Collinear.collinear(new double[][]{{0.0, 0.0}, {2.0, 3.0}, {1.0, 1.0}}));
        
        // Same as axis parallel above
        assertTrue(Collinear.collinear(new double[][]{{0.0, 0.0}, {0.0, 1.0}, {0.0, -1.0}}));
        assertTrue(Collinear.collinear(new double[][]{{1.0, 0.0}, {1.0, 0.0}, {-1.0, 0.0}}));        
    }
    
    @Test
    public void testArrayTrivial() {
        // Singleton and pair
        assertTrue(Collinear.collinear(new double[][]{{1.0, 5.0}}));
        assertTrue(Collinear.collinear(new double[][]{{1.0, 5.0}, {200.0, 200.0}}));
    }
    
    @Test 
    public void testArrayGeneral() {
        // TODO
    }

}
