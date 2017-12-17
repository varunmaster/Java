
public class Gambler {

	public static void main(String[] args) {
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);		
		
		int money = stake;
		while (money < goal && money > 0) {
			//toss a fair coin
			double rnd = Math.random(); //[0,1)
			boolean heads = (rnd < 0.5);
			if (heads){
				money = money + 1; //same as money +=1 or ++money
			}else {
				--money;
			}
		}
		
		boolean win = (money == goal);
		
		System.out.println("Win: " + win);

	}

}
