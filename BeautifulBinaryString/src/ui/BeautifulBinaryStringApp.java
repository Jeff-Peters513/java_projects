package ui;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulBinaryStringApp {


    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
    	//int bb = Integer.parseInt(b);
    	Pattern p = Pattern.compile("010");
    	System.out.println("pattern "+ p);
    	Matcher m = p.matcher(b);
    	System.out.println("matcher "+ m);
    	int counter = 0;
    	while(m.find()) counter++;
    	return counter;
    	
    	
    	
    	//int stringL = b.length();
    	
    	
    	//System.out.println("after parse " + bb);
    	//System.out.println("in method " + stringL);
    	
    	
   

    }

      public static void main(String[] args) {
      	String case1 ="Case 1";
    	int n = 7;
    	String b = "0101010";
    	//beautifulBinaryString(b);
    	
    	//case 2 => 1
    	//int n = 5;
    	//String b = 01100;
    	
    	//case 3 => 2
    	//int n = 10;
    	//String b = 0100101010;
    	//System.out.println(case1);
    	//System.out.println(n);
    	//System.out.println(b);
    	//System.out.println("Length: " + b.length());
        
        int result = beautifulBinaryString(b);
        System.out.println();
        System.out.println("Results of "+ case1);
        System.out.println(result);
        
       }
}

