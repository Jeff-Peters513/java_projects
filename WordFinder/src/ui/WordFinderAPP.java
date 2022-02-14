package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFinderAPP {

	public static void main(String[] args) throws IOException {
		// coding with John ScrabbleSolver
		// C:/repos/java_projects/WordFinder/wordDictionary.txt
		//
		// 1. Welcome - start app
		System.out.println("Welcome to the word finder for Scrabble!!\n");

		// 1a. initialize variables etc..
		Scanner sc = new Scanner(System.in);

		BufferedReader reader = new BufferedReader(
				new FileReader("C:/repos/java_projects/WordFinder/wordDictionary.txt"));

		// 2. input from user
		System.out.println("Please enter your pool letters with no spaces:  ");
		String letters = sc.nextLine().toUpperCase();

		// 3. business logic
		Map<Character, Integer> lettersCountMap = getCharacterCountMap(letters);

		System.out.println("\nAll possible words you can make with those letters: \n");
		
		for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {
			Map<Character, Integer> currentWordMap = getCharacterCountMap(currentWord);

			boolean canMakeCurrentWord = true;
			for (Character character : currentWordMap.keySet()) {
				int currentWordCharCount = currentWordMap.get(character);
				int lettersCharCount = lettersCountMap.containsKey(character) ? lettersCountMap.get(character) : 0;

				if (currentWordCharCount > lettersCharCount) {
					canMakeCurrentWord = false;
					break;
				} // end of if

			} // inner for
			if (canMakeCurrentWord) {
				System.out.println(currentWord);
			}

			sc.close();
			// reader.close();

		} // outer for

		// 4. display results

		// 5. bye - close app

		System.out.println("\nHope this was useful to win Scrabble!!  Bye!");

	}

	// method section
	private static Map<Character, Integer> getCharacterCountMap(String letters) {
		Map<Character, Integer> lettersCountMap = new HashMap<>();

		for (int i = 0; i < letters.length(); i++) {
			char currentChar = letters.charAt(i);

			int count = lettersCountMap.containsKey(currentChar) ? lettersCountMap.get(currentChar) : 0;

			lettersCountMap.put(currentChar, count + 1);
		} // end of for

		return lettersCountMap;

	}// end of method

}// end of class
