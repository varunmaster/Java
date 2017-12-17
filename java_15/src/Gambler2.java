
public class Gambler2 {

	public static void main(String[] args) {
		int stake = Integer.parseInt(args[0]); 
		int goal = Integer.parseInt(args[1]);
		int games = Integer.parseInt(args[2]);
		
		int totalWins = 0;
		int totalSteps = 0;
		for (int g = 0;  g < games;  g++) {
			// **** Simulate one game
			int money = stake;
			int steps = 0;
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
				++steps;
			}
			boolean win = (money == goal);
			//System.out.println("Win: " + win);
			// *** End simulation of one game
			
			if (win) {
				++totalWins;
			}
			totalSteps += steps;
		}
		
		System.out.println("Total wins: " + totalWins);
		System.out.println("Prob. estimate: " + (double)totalWins/games);
		System.out.println("Est. avg steps: " + (double)totalSteps/games);
	}

}
