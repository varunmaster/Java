
public class RandomInt2 {

	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		
		//generate a random integers between M and N-1 (inclusive)
		
		int rnd = (int)(Math.random()*(N-M) + M);
		//int = (int)(math.random()*(N-M)) + M; //alternative, 
		
		System.out.println(rnd);
		
		

	}

}
