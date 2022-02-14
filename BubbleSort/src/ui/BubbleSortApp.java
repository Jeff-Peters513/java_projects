package ui;

import java.util.Random;

public class BubbleSortApp {

	public static void main(String[] args) {
		// BubbleSort from Coding with John YouTube video

		// Create a new random object
		Random rand = new Random();
		// create an array for the random numbers generated
		int[] numbers = new int[1000000];

		// fill array to sort with random numbers from 1 to 1,000,000
		// using for loop
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000000);
		} // end of for loop

		// print array of number to the console to see them out of order
		System.out.println("Before: ");
		printArray(numbers);

		// Sorting code here
		boolean swappedSomething = true;

		while (swappedSomething) {

			swappedSomething = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					swappedSomething = true;
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;

				} // end if

			} // end sorting code
		} // while loop
// Print array after sorting
		System.out.println("After: ");
		printArray(numbers);

	}// end of main

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}// end of printArray method

}// end of class
