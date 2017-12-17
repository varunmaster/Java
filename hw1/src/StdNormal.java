public class StdNormal {
	public static void main(String[] args) {
		double u = Math.random();
		double v = Math.random();
		double inside; 
		double sqrt; 
		double product;
		double sin;
		double answer;
	
		inside = ((Math.log(u))*(-2));
		sqrt = Math.sqrt(inside);
		product = Math.PI * (v * 2.0);
		sin = Math.sin(product);
		answer = (sin * sqrt);
		
		System.out.println(answer);
	}
}
