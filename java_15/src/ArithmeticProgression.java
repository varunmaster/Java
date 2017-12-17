
public class ArithmeticProgression {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int delta = Integer.parseInt(args[1]);
		
		int val = 0;
		
		while (val <= N){
			System.out.println(val);
			val = val + delta;
			
		}
	}

}
