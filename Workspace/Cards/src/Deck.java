public class Deck {

    private Card[] cards;
    private int topCardIndex;
	private int topCard = 0;

    public Deck() {
        cards = new Card[52];
        int numberOfCard = 0;
        for(int suit = 0; suit <= 3; suit++){
            for(int value = 1; value <= 13; value++){
                cards[numberOfCard] = new Card(value, suit);
                numberOfCard++;
            }
        }
        topCardIndex = 0;
    }

    public Card getCardAt(int position) {
        if (position >= cards.length - topCardIndex || position < topCardIndex) {
            throw new IndexOutOfBoundsException("Values are out of bounds");
        } else {
            return cards[topCardIndex + position];
        }
    }

    public Card[] deal(int numCards) {
        Card[] drawnCards = new Card[numCards];
        for(int index = 0; index < numCards; index ++) {
            drawnCards[index] = cards[topCard];
            topCard ++;
        }
        return drawnCards;
    }
}