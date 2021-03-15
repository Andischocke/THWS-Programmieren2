package exercise20.task4;

import java.util.Comparator;

public class CrosswordComparator implements Comparator<String> {

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
}