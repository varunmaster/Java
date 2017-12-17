public class Flip {

	public static void main(String[] args) {
		double rnd = Math.random(); // generates number from 0 to 1
		boolean isHeads = (rnd > 0.5);
		
		if (isHeads){
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
		

	}

}
