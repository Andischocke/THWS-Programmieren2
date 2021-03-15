package exercise18.task2;

import exercise18.task1.Card;
import exercise18.task1.Hand;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSkat implements Comparator<Card> {
	public String[] suits = { "Club", "Spades", "Heart", "Diamond" };
	public String[] ranks = { "Jack", "Ace", "King", "Queen", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

	public int indexSuit(Card card) {
		return Arrays.asList(suits).indexOf(card.getSuit());
	}

	public int indexRank(Card card) {
		return Arrays.asList(ranks).indexOf(card.getRank());
	}

	@Override
	public int compare(Card card0, Card card1) {
		if (indexRank(card0) == 0 && indexRank(card1) != 0) {
			return -1;
		} else if (indexRank(card0) != 0 && indexRank(card1) == 0) {
			return 1;
		} else if (indexRank(card0) == 0 && indexRank(card1) == 0) {
			if (indexSuit(card0) < indexSuit(card1)) {
				return -1;
			} else if (indexSuit(card0) > indexSuit(card1)) {
				return 1;
			}
		} else if (indexRank(card0) != 0 && indexRank(card1) != 0) {
			if (indexSuit(card0) < indexSuit(card1)) {
				return -1;
			} else if (indexSuit(card0) < indexSuit(card1)) {
				return 1;
			} else if (indexSuit(card0) == indexSuit(card1)) {
				if (indexRank(card0) < indexRank(card1)) {
					return -1;
				} else if (indexRank(card0) > indexRank(card1)) {
					return 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Hand hand = new Hand();
		System.out.println(hand);
		Collections.sort(hand.cards, new ComparatorSkat());
		System.out.println(hand);
	}
}