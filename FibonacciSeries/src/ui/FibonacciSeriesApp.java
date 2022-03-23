package ui;

public class FibonacciSeriesApp {

	private static long[] fibonacciCache;

	public static void main(String[] args) {
		// Coding with john
		// n=92 is the highest long number will allow 
		int n = 92;

		fibonacciCache = new long[n + 1];

		for (int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i)+ " ");
		}
	}

	private static long fibonacci(int n) {
		//base case for recursion
		if (n <= 1) {
			return n;
		}

		//use number already in cache
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		//calculate nth fibonacci number using recursion
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		
		//store nthFibonacciNumber in cache to speed up program
		fibonacciCache[n] = nthFibonacciNumber;

		return nthFibonacciNumber;

	}

}
