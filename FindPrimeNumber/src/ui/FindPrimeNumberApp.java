package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrimeNumberApp {

	public static void main(String[] args) {
		// A prime number is a whole number > 1,
		// that has only 2 factors 1 and itself.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the upper number limit: ");
		int limit = sc.nextInt();
		sc.close();
		
		List<Integer> primeNumbers = new ArrayList<>();

		for (int numberToCheck = 2; numberToCheck <= limit; numberToCheck++) {

			boolean isPrime = true;
			for (int factor = 2; factor <= numberToCheck/2; factor++) {
				if (numberToCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primeNumbers.add(numberToCheck);
			}
		}
		System.out.println("Prime numbers from 1 to "+limit+ "are: ");
		for (Integer number : primeNumbers) {
			System.out.println(number);
		}
	}

}
