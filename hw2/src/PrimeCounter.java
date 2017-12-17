
public class PrimeCounter {
	public static void main(String[] args) {
	/*	int N = Integer.parseInt(args[0]);
		int Number = 0;
		
		for (int i = 1;  i <= N;  i++) {
			System.out.println("i is " + i);
			boolean isPrime = true;
			for (int j = 2;  j <= Math.sqrt(i); j++) {
				System.out.println("j is " + j);
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				++Number;
			}
		}
		System.out.println(Number);
		*/
		int N = Integer.parseInt(args[0]);
		int Number = 0;
		
		for (int i = 1;  i <= N;  i++) {
			boolean Prime = true;
			for (int j = 2;  j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					Prime = false;
				}
			}
			if (Prime == true) {
				++Number;
			}
		}
		System.out.println(Number);
	}
}
