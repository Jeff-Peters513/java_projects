package getUniqueChar;

public class getUniqueCharI2APP {

	public static void main(String[] args) {
		String s="bbyee"; 
		getUniqueCharacter2(s);

	}
	private static int getUniqueCharacter2(String s) {
		int count = -1;
		for(char ch:s.toCharArray()){
			System.out.print(ch + " ");
    		if(s.indexOf(ch) == s.lastIndexOf(ch)){
            count = s.indexOf(ch);
    		}//end of nested if
    	}//end for loop  
		 System.out.println("\n"+count);
	      return count;		
		
	}

}
