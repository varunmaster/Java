public class Loan {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		
		double answer;  
		double exponent;
		double ert;
		
		exponent = (r * t);
		ert = (Math.exp(exponent));
		answer = (((p * ert)/(t * 12)));
		
		System.out.println(answer);
		
	}
}
