package exercise18.task4;

import java.util.*;

public class VocabularyTrainer {
	public Map<String, Set<String>> dictionaryMap = new HashMap<>();
	public String englishWord;

	public VocabularyTrainer() {
		addWordToDictionary("to clean", "reinigen", "s�ubern", "putzen");
		addWordToDictionary("to expand", "vergr��ern", "wachsen");
	}

	public void addWordToDictionary(String english, String... german) {
		dictionaryMap.put(english, new HashSet<String>(Arrays.asList(german)));
	}

	public void drawWordFromDictionary() {
		int random = (int) (Math.random() * dictionaryMap.size());
		Set<String> keySet = dictionaryMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		for (int i = 0; iterator.hasNext(); i++) {
			String string = iterator.next();
			if (i == random) {
				englishWord = string;
				return;
			}
		}
	}

	public boolean isTranslated(String guess) {
		Set<String> translation = dictionaryMap.get(englishWord);
		Iterator<String> iterator = translation.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (string.equals(guess)) {
				return true;
			}
		}
		return false;
	}

	public void start() {
		Scanner scanner = new Scanner(System.in);
		drawWordFromDictionary();
		System.out.printf("Translate %s to german: ", englishWord);
		String string = scanner.nextLine();
		if (isTranslated(string)) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		VocabularyTrainer trainer = new VocabularyTrainer();
		trainer.start();
	}
}