package ui;

import java.util.Arrays;

public class PracticeTestApp {

	public static void main(String[] args) {
		//create array of 11 random integers
		int[] numbers = new int[11];
		for (int i =0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*51);
		}// end for
		
		//sort the array
		Arrays.sort(numbers);

		//display numbers
		String numbersString = "";
		for (int number: numbers) {
			numbersString += number + " ";
		}// end of for 
		System.out.println("Numbers: "+ numbersString);
		
		//Calculate total and display
		int total = 0;
		for (int number: numbers) {
			total += number;
		}// end of for 
		System.out.println("Total: "+ total);
		
		//get count of numbers and display
		int count = numbers.length;
		System.out.println("Count: "+ count);
		
		//calculate average and display
		double average = (double) total/count;
		average = (double) Math.round(average * 10)/10;
		System.out.println("Average: " + average);
		
		//if count of numbers is odd
		if (count %2 != 0 ) {
			int medianIndex = count /2;
			int median = numbers[medianIndex];
			System.out.println("Median: " + median);
		}	
			
	}
}
