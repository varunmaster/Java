
public class FloatCoercion {

	public static void main(String[] args) {
		System.out.println(0.1 + 5/3); //because the whole thing is integer it results an integer
		System.out.println(0.1 + 5.0/3); //because the its 5.0 the three gets converted to double floating point (more decimals)
		
		int a = 5, b = 3;
		System.out.println(0.1 + a*1.0/b); //the "a*1.0" converts it to floating point
		System.out.println(0.1 + (a + 0.0)/b); //another way of doing above --> converting to floating point
		

	}

}
