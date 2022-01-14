package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunWithAnagramsApp2 {
	/*
	 * Goal is to only keep the first anagram from the collection of words then
	 * finally print the new array in ascending order
	 * 
	 */
	public static void main(String[] args) {

		String arr[] = { "geeks", "keegs", "code", "doce", "jeff", "imothyt", "ffej", "timothy"};

		// adding given strings from an array to any ArrayList
		ArrayList<String> agram = new ArrayList<>();
		for (String s : arr) {
			agram.add(s);
		}
		System.out.println("agram ArrayList contents " + agram);

		// create temp ArrayList to hold and sort letters of each string
		ArrayList<String> temp = new ArrayList<>();
		//
		// create final ArrayList to hold first found anagram only
		ArrayList<String> last = new ArrayList<>();
		//
		//Create 
		String[] arr2 = new String[agram.size()];
		// System.out.println(arr2.length);
		for (int j = 0; j <= agram.size() - 1; j++) {
			arr2[j] = agram.get(j);
		}
		
		for (int k = 0; k <= arr2.length - 1; k++) {
			//
			String word = arr2[k];
			word = sort(word);			

			if (!temp.contains(word)) {
				// add the first found "sorted (letters)" word not found in temp to the
				// last ArrayList
				last.add(arr2[k]);
				// add sorted letter word to the temp arrayList so it will not appear again
				// in the last ArrayList more than once.
				temp.add(word);
			}//end if statement
		}//end for loop

		Collections.sort(last);
		System.out.println(last);

	}// end of main

	private static String sort(String t) {
		// Alphabetize letters in string and return
		char ch[] = t.toCharArray();

		// sort letters in each char array
		Arrays.sort(ch);
		/*
		 * for (char c: ch) { System.out.print(c+" "); }
		 */

		// convert sorted char array to a new string
		String sortedString = new String(ch);

		// return the sorted char's in a new string
		return sortedString;
	}// end method sort

}// close of class
