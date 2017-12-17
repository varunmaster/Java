public class OrderCheck {
	public static void main(String[] args) {
		// TODO Fill in your solution here
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		
		if(x < y && y < z){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}
}
