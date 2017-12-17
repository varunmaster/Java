public class Multiply {
	public static void main(String[] args) {
		// TODO Fill in your solution here
		float x = Float.parseFloat(args[0]);
		float y = Float.parseFloat(args[1]);
		System.out.println(multiply(x, y));
	}
	public static float multiply (float x, float y){		
		return x * y;
	}
}
