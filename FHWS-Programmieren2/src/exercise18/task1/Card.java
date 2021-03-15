package exercise18.task1;

public class Card implements Comparable<Card> {
	public String suit;
	public String rank;

	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public int compareTo(Card card) {
		Deck deck = new Deck();
		if (deck.indexSuit(this) < deck.indexSuit(card)) {
			return -1;
		} else if (deck.indexSuit(this) > deck.indexSuit(card)) {
			return 1;
		} else if (deck.indexSuit(this) == deck.indexSuit(card)) {
			if (deck.indexRank(this) < deck.indexRank(card)) {
				return -1;
			} else if (deck.indexRank(this) > deck.indexRank(card)) {
				return 1;
			}
		}
		return 0;
	}

	public String toString() {
		return String.format("%s%s", suit, rank);
	}
}