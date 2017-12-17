
public class StdNormal {
	public static double phi (double x){
		return Math.exp(-x*x/2)/Math.sqrt(2*Math.PI);
	}
	
	public static double phi (double x, double mu, double sigma){
		return phi((x-mu)/sigma)/sigma;
	}
}
