
public class PowerOfTwo {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		int i = 0;
		int v = 1;
		
		while (i <= N){
			System.out.println("2^" + i + " -> " + v);
			i = i + 1;
			v = v * 2;
		}

	}

}
