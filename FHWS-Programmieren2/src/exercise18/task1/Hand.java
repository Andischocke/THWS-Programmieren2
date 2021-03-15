package exercise18.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	public ArrayList<Card> cards = new ArrayList<>();

	public Hand() {
		Deck deck = new Deck();
		while (cards.size() < 10) {
			Card card = deck.getCard();
			if (!cards.contains(card)) {
				cards.add(card);
			}
		}
	}

	public String toString() {
		String string = "Your cards are: ";
		for (Card card : cards) {
			string += card + " ";
		}
		return string;
	}

	public static void main(String[] args) {
		Hand hand = new Hand();
		System.out.println(hand);
		Collections.sort(hand.cards);
		System.out.println(hand);
	}
}