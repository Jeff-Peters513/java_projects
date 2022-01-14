package ui;
import java.util.*;
import java.io.*;

public class LoopPracticeIIApp {

	/**
	 * LoopPracticeII on HackerRank 12-29-21 -> 12-31-21
	 */
	  public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=1;
	        int a = 0;
            int b = 2;
            int n = 10;
	        
	        
	        /**
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            */
	            int sum = a;
	            for(int j =0; j<n;j++) {
	            	//int calcNbr =2^j *b;
	            	sum += Math.pow(2, j)*b;
	            	System.out.print(sum+" ");
	            }//calcNbr loop and printout
	            
	            //if (i < t-1) System.out.print("\n");
	            
	        //}//input loop 
	        
	        //in.close();
	        
	    }//static main

}//close class
/**
 * input
 * 2
 * 0 2 10
 * 5 3 5
 * 
 * output
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 */
