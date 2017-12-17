
public class RandomInt {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		double rnd_fp = Math.random() * N;
		int rnd = (int)rnd_fp;
		
		System.out.println(rnd);

	}

}
