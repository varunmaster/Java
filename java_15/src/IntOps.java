
public class IntOps {

	public static void main(String[] args) {
		String arg1 = args [0];
		String arg2 = args [1];
		
		System.out.println(args.length);
		System.out.println(arg1);
		System.out.println(arg2);
		
		int num1 = Integer.parseInt(arg1); 
		int num2 = Integer.parseInt(arg2);
		
		System.out.println(num1 + " + " + num2 + " = " + 	
							(num1 + num2));
		System.out.println(num1 + " * " + num2 + " = " + 	
							(num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + 	
							(num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + 	
							(num1 % num2));
		
		System.out.print("sum: ");
		//System.out.println(arg1 + arg2);
		System.out.println(num1 + num2);
		
		
		
		

	}

}
