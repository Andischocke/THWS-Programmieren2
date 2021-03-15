package exercise20.task4;

import java.util.*;

public class CrosswordPuzzle {
	static String[] wordArray = { "Bienenschwarm", "Buch", "Bibel", "Beige", "Barriere", "Bein", "Beil", "Christ",
			"Christian", "Carmen" };
	
	public void test() {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.addAll(Arrays.asList(wordArray));
		for (String string : treeSet) {
			System.out.println(string);
		}
		System.out.println();

		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String string0, String string1) {
				if (string0.length() < string1.length()) {
					return -1;
				} else if (string0.length() > string1.length()) {
					return 1;
				} else if (string0.length() == string1.length()) {
					return string0.compareToIgnoreCase(string1);
				}
				return 0;
			}
		};

		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordArray));
		Collections.sort(wordList, comparator);
		for (String string : wordList) {
			System.out.println(string);
		}
	}
	
	public static void main(String [] args) {
		new CrosswordPuzzle().test();
	}
}