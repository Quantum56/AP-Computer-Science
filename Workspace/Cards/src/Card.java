public class Card {

	private final int suit;

	private final int value;

	private final static String[] suitNames = { "Spades", "Hearts", "Clubs", "Diamonds" };
	private final static String[] cardNames = { "Null", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public Card(int value, int suit) {
		if (value < 1 || value > 13) {
			throw new RuntimeException("Illegal card value attempted.  The " + "acceptable range is 1 to 13.  You tried " + value);
		}
		if (suit < 0 || suit > 3) {
			throw new RuntimeException("Illegal suit attempted.  The " + "acceptable range is 0 to 3.  You tried " + suit);
		}
		this.suit = suit;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	public String toString() {
		return cardNames[value] + " of " + suitNames[suit];
	}

	public String getImageFileName() {

		String retValue;
		retValue = suitNames[suit];
		if (value <= 10) {
			retValue += value;
		} else
		if (value == 11) {
			retValue += "Jack";
		} else
		if (value == 12) {
			retValue += "Queen";
		} else
		if (value == 13) {
			retValue += "King";
		} else
			retValue += "Null";
		return "images/" + retValue + ".gif";
	}
}