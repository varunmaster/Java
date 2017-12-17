
public class Knapsack {
		public static void main(String[] args) {
				if (args.length % 2 != 1) {
					System.err.println("Invalid number of arguments (must be even)");
				}
				int N = (args.length-1)/2;
				int C = Integer.parseInt(args[0]);
				int[] w = new int[N];
				int[] v = new int[N];
				for (int i = 0;  i < N;  i++) {
					w[i] = Integer.parseInt(args[i+1]);
					v[i] = Integer.parseInt(args[i+N+1]);
				}
				int bestNumb = knapsack(C, w, v);
				System.out.println(bestNumb);
			}
			
			public static int knapsack(int C, int [] w, int [] v) {
				int wLen = w.length;
				int [] K = new int[C+1];
				K[0] = 0;
				int best = 0;
				for (int W=1; W <= C; W++) {
					    
					for (int i=0; i <wLen; i++) {
						if (W >= w[i]) {
							best = Math.max(K[W-w[i]] + v[i], best);
						}
					}
					K[W] = best;
				}
					
				return K[C];
			}
	}
