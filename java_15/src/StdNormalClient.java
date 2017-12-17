
public class StdNormalClient {

	public static void main(String[] args) {
		double mu = 0.0, sigma = 1.0;
		if (args.length == 2){
			mu = Double.parseDouble(args[0]);
			sigma = Double.parseDouble(args[1]);
		}
		
		
		for (double x = -3.0; x <= 3.0; x+=0.2){
			double phi_x = StdNormal.phi(x);
			System.out.println("phi(" + x + ") = " + phi_x);
		}

	}

}
