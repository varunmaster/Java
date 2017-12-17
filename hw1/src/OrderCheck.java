public class OrderCheck {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		
		if (x>y && y>z){
			System.out.println("True");
		} else if (x<y && y<z){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}