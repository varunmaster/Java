public class ChargeClient {
	
	public static void main (String[] args){
		Charge c = new Charge(3, 2, 5);
		double p = c.potentialAt(6, 4);
		System.out.println(p);
		System.out.println(c.toString());
	}
}
