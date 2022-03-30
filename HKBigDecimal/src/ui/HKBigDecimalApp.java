package ui;

import java.math.BigDecimal;
import java.util.*;

public class HKBigDecimalApp implements Comparator<String> {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		// give an array s of n real numbers
		// sort in descending order
		// and the format of number read must be printed
		// back out 1.0 = 1.0; 1=1 etc..
		// Arrays.sort(array, int fromIndex, int toIndex, comparator)
		
		//Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		
		//String[] s = {9, "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };
		
//		for (int i = 0; i <= s.length-1; i++) {
//			System.out.println(s[i]);
//		}

		
		System.out.println("First string number in the array: " + n);

		System.out.println("\nhope this sorted correctly");
		Arrays.sort(s,0,n, Collections.reverseOrder(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// BigDecimal goes in here
				BigDecimal a = new BigDecimal(s1);
				BigDecimal b = new BigDecimal(s2);
				return a.compareTo(b);
			}
		
		}));
		
		//Output
		for (int i = 0; i <= s.length - 1; i++) {
			System.out.println(s[i]);
		}


	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
