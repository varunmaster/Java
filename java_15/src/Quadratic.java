
public class Quadratic {

	public static void main(String[] args) {
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		
		double discriminant = b*b - 4*c;
		double root1 = (-b + Math.sqrt(discriminant))/2.0;
		double root2 = (-b - Math.sqrt(discriminant))/2.0;
		
		System.out.println("x^2 + " + b + "*x + " + c + "=0");
		System.out.println("root1 = " + root1);
		System.out.println("root2 = " + root2);
		
	}

}
