package ui;

import java.util.Scanner;

public class HKPalindromeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		//String A = "tattarrattat";
		//String A = "level";
		//String A = "madam";
		//String A = "121";
		// isPalindrome(A);
		int k = 0;
				
		for (int i = 0, j = A.length() - 1; i <= j; i++, j--) {

			if (A.charAt(i) != A.charAt(j)) {
				k = 1;
			}

		}
	

		System.out.println((k == 0) ? "Yes" : "No");
		sc.close();

		// Printout
		//System.out.println(isPalindrome(A));
	}

//	private static String isPalindrome(String str) {
//
//		return str;
//
//	}

}
