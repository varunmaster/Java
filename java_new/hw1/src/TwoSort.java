public class TwoSort {
	public static void main(String[] args) {
		// TODO Fill in your solution here
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		if(x < y){
			System.out.println(x + " " + y);
		}else{
			System.out.println(y + " " + x);
		}
	}
}
