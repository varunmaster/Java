
public class Gambler1 {

	public static void main(String[] args) {
		int stake = Integer.parseInt(args[0]); 
		int goal = Integer.parseInt(args[1]);
		int games = Integer.parseInt(args[2]);
		
		int totalWins = 0;
		for (int g = 0;  g < games;  g++) {
			// **** Simulate one game
			int money = stake;
			while (money < goal && money > 0) {
				// Toss a (fair) coin
				double rnd = Math.random();  // [0,1)
				//double rndHalf = (rnd * 0.5); // Analogous, *syntactically* (same evaluation process, but behavior different)
				boolean heads = (rnd < 0.5);
				if (heads) {
					++money;
				} else {
					--money;
				}
			}
			boolean win = (money == goal);
			//System.out.println("Win: " + win);
			// *** End simulation of one game
			
			if (win) {
				++totalWins;
			}
		}
		
		System.out.println("Total wins: " + totalWins);
		System.out.println("Prob. estimate: " + (double)totalWins/games);
	}

}
