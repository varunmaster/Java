
public class ArgumentPassing {

	public static int getMultiplyBy2a(int [] a, int i){
		return 2*a[i];
	}
	
	public static int getMultiplyBy2b(int [] a, int i){
		a[i] *= 2;
		return a[i];
	}
	
	public static void main(String[] args) {
		int [] arr = { 1 ,2,3,4,5 };
		
		System.out.println(getMultiplyBy2a(arr, 1));
		System.out.println(arr[1]);	
		
		System.out.println("------");
		
		System.out.println(getMultiplyBy2b(arr, 1));
		System.out.println(arr[1]);

	}

}
