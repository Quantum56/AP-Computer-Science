import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZackB
 */

public class DeckShuffle {

	private static String finalResult;
	private static String sevenOfHearts = "7 of Hearts";

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
			Map<Integer, String> map = new HashMap<Integer, String>();
			finalResult = map.put(Integer.valueOf(i), result);

		}
		Arrays.asList(finalResult).indexOf(sevenOfHearts);
		finalResult = finalResult.replaceAll("null", "");
		System.out.println(finalResult);
	}

}
