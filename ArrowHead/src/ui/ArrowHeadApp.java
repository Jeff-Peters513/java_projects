package ui;

import java.util.Scanner;

public class ArrowHeadApp {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to ArrowHead Application!");
		System.out.println();
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to create an arrowhead.");
		int inputNbr = sc.nextInt();
		
		//business logic
		for (int i = 1; i <= inputNbr; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
				System.out.print(">");				
			}			
		}
		for (int i = inputNbr-1; i > 0; i--) {
			System.out.println("");
			for (int l = inputNbr-1; l > 0; l--) {
				System.out.print(">");				
			}			
		}
		sc.close();
		//display results
		
		//bye
		System.out.println("");
		System.out.println("\nBye come back soon!");
		
	}

}
