
public class AbsOverload {

	public static int abs(int x){
		if (x<0){
			return -x;
		}else {
			return x;
		}
	}
	public static double abs(double x){
			if (x<0){
				return -x;
			}else {
				return x;
			}
		}
		
		public static void main(String[] args){
			System.out.println(abs(5.0)); //since the x is a double, it uses the double abs function 
			System.out.println(abs(-5.0));
			
			System.out.println(abs(5));  //still prints 5.0 because int gets converted to double because uses the only function which is a double abs. but after adding the int abs, it uses that function rather than the double 
			System.out.println(abs(-5)); 
		}
}
