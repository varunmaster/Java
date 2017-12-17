
public class CouponCollector {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); //# of distinct card type
		
		//play game once
		int numBought = 0;
		int numTypesCollected = 0; //out of n
		boolean[] gotType = new boolean[N]; //default init: all false
		while(numTypesCollected < N){ //while(I have not collected all)
			//buy one card of random type
			++numBought;
			int newCardType = (int)(N*Math.random());
			if (!gotType[newCardType]){ //if (I have not got that type already)
				++numTypesCollected;
				gotType[newCardType] = true;
			}
		}
		System.out.println(numBought);

	}

}
