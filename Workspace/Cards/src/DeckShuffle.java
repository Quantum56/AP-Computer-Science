// import java.util.Arrays;									//unnecessary
// import java.util.HashMap;									//unnecessary
// import java.util.Map;									//unnecessary

/**
 * @author ZackB
 */

public class DeckShuffle {

//	private static String finalResult;							//unnecessary
//	private static String sevenOfHearts = "7 of Hearts";					//unnecessary

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] cards = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		for (int i = 0; i < 52; i++) {
			String suit = suits[deck[i] / 13];
			String rank = cards[deck[i] % 13];
			String result = rank + " of " + suit;
			System.out.println(result);
			// Map<Integer, String> map = new HashMap<Integer, String>();		//unnecessary
			// finalResult = map.put(Integer.valueOf(i), result);			//unnecessary

		}
		// Arrays.asList(finalResult).indexOf(sevenOfHearts);				//unnecessary
		// finalResult = finalResult.replaceAll("null", "");				//unnecessary
		// System.out.println(finalResult);						//unnecessary
	}

}
