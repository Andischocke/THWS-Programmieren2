package exercise18.task1;

import java.util.Arrays;

public class Deck {
	public String[] suits = { "Heart", "Diamond", "Club", "Spades" };
	public String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	Card[][] deck = new Card[suits.length][ranks.length];

	public Deck() {
		for (int suit = 0; suit < suits.length; suit++) {
			for (int rank = 0; rank < ranks.length; rank++) {
				deck[suit][rank] = new Card(suits[suit], ranks[rank]);
			}
		}
	}

	public int indexSuit(Card card) {
		return Arrays.asList(suits).indexOf(card.getSuit());
	}

	public int indexRank(Card card) {
		return Arrays.asList(ranks).indexOf(card.getRank());
	}

	public Card getCard() {
		return deck[(int) (Math.random() * suits.length)][(int) (Math.random() * ranks.length)];
	}
}