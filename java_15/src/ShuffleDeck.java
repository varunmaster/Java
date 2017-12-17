
public class ShuffleDeck {

	public static void main(String[] args) {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		String[] deck = new String[52];
		
		//int pos = 0;
		for (int i = 0; i < ranks.length; i++){
			for (int j = 0; j < suits.length; j++){
				//System.out.println(ranks[i] + " of " + suits[j]);
				//with helper variable
				//deck[pos] = ranks[i] + " of " + suits[j];
				//++pos;
				
				//without helper, noting relation to i , j
				deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
			}
		}
		//shuffle the deck
		for (int i = 0; i < deck.length; i++){
			//pick a card at random from remaining (untouched) 51-i cards
			int rnd = (int)((deck.length - i)*Math.random());
			//hold that card
			String in_hand = deck[rnd];
			//put it at the back, specifically: position 51-i
			//need to shift everything from pos rnd+1 to pos 51-i
			//to make space
			for (int j = rnd + 1; j < (deck.length-1) - 1; j++){
				deck[j-1] = deck[j];
			}
			deck[(deck.length-1)-i] = in_hand;
		}
		
		//print deck
		for (int i = 0; i < deck.length; i++){
			System.out.println(deck[i]);
		}
	}
}
