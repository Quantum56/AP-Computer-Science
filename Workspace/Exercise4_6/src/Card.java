import java.util.Random;

/**
 *  Application that prints 20 random cards ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king
 */

/**
 * @author ZackB
 *
 */
public class Card {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		final int x = 20;
		int numVal;
		for (int i = 0; i < x; i++) {
			numVal = gen.nextInt(13) + 1;
			int c = gen.nextInt(4) + 1;
			String face = "";
			String suit = "";
			if (numVal > 2 && numVal <= 10) {
				if (c == 1) {
					suit = "Spades";
				}
				if (c == 2) {
					suit = "Clubs";
				}
				if (c == 3) {
					suit = "Hearts";
				}
				if (c == 4) {
					suit = "Diamonds";
				}
				System.out.format("%d of %s\n", numVal, suit);
			} else {
				for (int i1 = 0; i1 < 2; i1++) {
					if (c == 1) {
						suit = "Spades";
					} 
					else if (c == 2) {
						suit = "Clubs";
					} 
					else if (c == 3) {
						suit = "Hearts";
					} 
					else if (c == 4) {
						suit = "Diamonds";
					}
					if (numVal == 1) {
						face = "Ace";
					} 
					else if (numVal == 11) {
						face = "Jack";
					} 
					else if (numVal == 12) {
						face = "Queen";
					} 
					else if (numVal == 13) {
						face = "King";
					}
					if (face == "")
						face = "Ace";
				}
				System.out.format("%s of %s\n", face, suit);
			}

		}
	}
}