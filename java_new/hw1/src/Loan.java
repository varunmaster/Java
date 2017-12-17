public class Loan {
	public static void main(String[] args) {
		// TODO Fill in your solution here
		double t = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		
		double formula = p * Math.exp(r*t);
		double payments = formula / (12*t);
		
		System.out.println(payments);
	}
}
