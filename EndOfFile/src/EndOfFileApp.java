import java.io.*;
import java.util.*;


public class EndOfFileApp {

    public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. 
          * Print output to STDOUT. Your class should be named Solution. */
    	
    	//Hint: Java's Scanner.hasNext() method is helpful 
    	//for this problem.
    	Scanner sc = new Scanner(System.in);
    	
    	for (int i =0; sc.hasNext() ;i++) {
    		System.out.println(i+" "+sc.nextLine());
    	}
    	
    }	
}
