package exercise17.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Hangman {
	public ArrayList<String> words = new ArrayList<>();
	public char[] word;
	public char[] dash;
	public int attempt;
	public boolean won;

	public Hangman() {
		words.add("HELLO");
		words.add("WORLD");
	}

	public void start() {
		word = words.get((int) (Math.random() * words.size())).toCharArray();
		dash = new char[word.length];
		for (int i = 0; i < word.length; i++) {
			dash[i] = '_';
		}
		attempt = 15;
		won = false;
	}

	public String guess(String string) {
		String output = null;
		if (attempt > 0 && !won) {
			attempt--;
			for (int i = 0; i < word.length; i++) {
				if (Character.toUpperCase(word[i]) == Character.toUpperCase(string.charAt(0))) {
					dash[i] = word[i];
				}
			}
			output = String.valueOf(dash);
			if (Arrays.equals(word, dash)) {
				won = true;
			}
		}
		if (attempt <= 0 || won) {
			output = getResult();
		}
		return output;
	}

	public String getResult() {
		String string;
		if (won) {
			string = String.format("Victory: Word was %s.\t", String.valueOf(word), attempt);
		} else {
			string = String.format("Defeat: Word was %s.\t", String.valueOf(word), attempt);
		}
		string += "New Hangman Launched!";
		start();
		return string;
	}
}