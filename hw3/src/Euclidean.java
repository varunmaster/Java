
public class Euclidean {

	public static void main(String[] args) {
		float sum = 0;
		
		for(int i = 0; i < args.length; i++){
			sum += (float)(Math.pow((Float.parseFloat(args[i])),2));
		}
		System.out.println(Math.sqrt(sum));
	}
}
