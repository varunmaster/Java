
public class MatrixSum {

	public static void main(String[] args) {
		double[][] a = { { 1, 2, 3 },
				 { 4, 5, 6 } };
		double[][] b = { { 0.3, 0.2, 0.1 },
		         { 0.9, 0.8, 0.7 } };

		int M = a.length; //  # rows
		int N = a[0].length;  //  # cols (assume rectangular and non-empty)

		// Matrix sum
		double[][]sum = new double[M][N];
		for (int i = 0;  i < M;  i++) { // Iterate over all rows
			for (int j = 0; j < N;  j++) { // Iterate over all cols of i-th row
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		// Print out result
		for (int i = 0;  i < M;  i++) { // Iterate over all rows
			for (int j = 0; j < N;  j++) { // Iterate over all cols of i-th row
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
