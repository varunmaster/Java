
public class SimpleCalculator {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		String op = (args[1]);
		double y = Double.parseDouble(args[2]);
		
		if (op.equals("+")){
			System.out.println(x+y);
		}else if (op.equals("-")){
			System.out.println(x-y);
		}else if (op.equals("*")){
			System.out.println(x*y);
		}else if (op.equals("/")){
			System.out.println(x/y);
		}else {
			System.out.println("Invalid operator");
		}
	}
}
