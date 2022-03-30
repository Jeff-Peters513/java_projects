package ui;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MoneyFormatingAPP {
	    
	    public static void main(String[] args) {
	        //Scanner scanner = new Scanner(System.in);
	        double payment = 12324.134;
	        		//scanner.nextDouble();
	        //scanner.close();
	        
	        Locale indiaLocale = new Locale("en", "IN");

	        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
	        
	        String us = currency.format(payment);
	        
	        NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(indiaLocale);
	        	        
	        String india = indiaCurrency.format(payment);
	        
	        NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        	        
	        String china = chinaCurrency.format(payment);
	        
	        NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	              
	        String france = franceCurrency.format(payment);
	        
	        
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	}
	
	
	


