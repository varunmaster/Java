
public class Truncate100 {

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		
		double y = ((int)(x * 100))/100.0;
		
		System.out.println(x + " -> " + y);

	}

}
