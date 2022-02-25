import java.util.Random;

public class MergeSortAlgorithmApp {

	public static void main(String[] args) {
		// Coding with John Merge Sort Algorithm
		Random rand = new Random();
		int[] numbers = new int[1000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000000);
		} // end of for loop

		System.out.println("Before: ");
		printArray(numbers);

		mergeSort(numbers);

		System.out.println("\nAfter: ");
		printArray(numbers);

	}// end of main

	private static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		// if array is of length 1 or less return that number?
		if (inputLength < 2) {
			return;
		}
		// find middle of array to split
		int midIndex = inputLength / 2;
		// create left and right arrays to fill
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		// fill left array
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		// fill right array
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		// now merge sort both arrays recursive
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		//
		merge(inputArray, leftHalf, rightHalf);

	}// end of mergeSort

	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		//
		int i = 0, j = 0, k = 0;
		//
		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		// clean up any remaining elements left in either array
		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}

	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}// end of printArray

}// end of class
