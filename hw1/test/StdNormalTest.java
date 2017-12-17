import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class StdNormalTest extends HomeworkTestBase {

	@Test
	public void test() {
        setMathRandomSeed(100L);
        StdNormal.main(new String[]{});
        // 0.759357210027685 or -1.7803546478383074, depending on u,v order
        double result = Double.parseDouble(getOutput());
		assertThat(result, anyOf(equalApprox(0.759357210027685), equalApprox(-1.7803546478383074)));
	}
	
	@Test
	public void testAnother() {
        setMathRandomSeed(2500L);
        StdNormal.main(new String[]{});
        // 0.1312523821030181 or -0.4526563878121621, depending on u,v order
        double result = Double.parseDouble(getOutput());
		assertThat(result, anyOf(equalApprox(0.1312523821030181), equalApprox(-0.4526563878121621)));
	}

}
