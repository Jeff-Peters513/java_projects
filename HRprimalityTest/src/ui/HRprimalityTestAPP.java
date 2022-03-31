package ui;
import java.math.BigInteger;

public class HRprimalityTestAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "2";
		BigInteger bi = new BigInteger(n);
			
	    boolean result = bi.isProbablePrime(1);
        System.out.println(result);
        System.out.println(result == true? "prime":"not prime");
		
	}

}
