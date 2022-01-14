package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopPracticeAppI {

	/**
	 * just for fun and to practice loops in java 8
	 * --It worked and passed all the unit tests - 12-29-21!! yeah
	 */
	   public static void main(String[] args) throws IOException {
	       //test number N
		   //int n = 2;
		   	   
		   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        for (int i = 1; i <= 10; i++) {
				   int m = i * N;
				   System.out.println(N +" x "+i+" = "+ m);
			   }
	        bufferedReader.close();  
		   
	    }
}
