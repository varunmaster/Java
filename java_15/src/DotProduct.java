
public class DotProduct {

	public static void main(String[] args) {
		double[] x = {1.0, 2.0, 3.0, 4.0};
		double[] y = {0.5, -0.5, 1.0, 2.0};
		
		int N = x.length;   // dimension
		// assume y.length == N
		double dotProduct = 0.0;
		
		for (int i = 0; i < N; i++) {
			dotProduct += x[i] * y[i];
		}
		System.out.println(dotProduct);
	}
}
