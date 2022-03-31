package ui;

public class Printer {

	public static <T> void printArray(T[] inputArray){
		for(T t : inputArray) {
			System.out.println(t);
		}
	}
}
