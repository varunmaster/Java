
public class BlockScopeExample {

	public static void main(String[] args) {
	int sumSquares = 0;
	int N = 10; 
	
	//int i; becomes a global variable so can be used again in another for loop and will refer to same i
	for(int i = 1; i <= N; i++){
		int square = i*i;
		sumSquares += square;  
		}
	System.out.println("Sum is " + sumSquares);
	
	}
}
