
public class SumToN {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		int sum  = 1;
		for (int i = 1; i < N; i++){
			sum += i+1;
			
		}
		System.out.println(sum);
	}

}
