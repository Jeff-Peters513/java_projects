package getUniqueChar;

public class UniquCharApp {

	public static void main(String[] args) {
		String s="aabbcc2yhghy"; 
		getUniqueCharacter(s);
	}

    public static int getUniqueCharacter(String s) {
    	// Write your code here
    	//String w = s;
    	//System.out.println(s.indexOf("a"));
    	
    	/*
    	System.out.println(s.indexOf("f"));
    	System.out.println(s.indexOf("a"));
    	System.out.println(s.indexOf("l"));
    	System.out.println(s.charAt(1));
    	System.out.println(s.length());
    	*/
    	/*
    	int rlts=0;
    	for (int i = 1; i <= s.length(); i++) {
    		if(s.charAt(i) != s.indexOf(s)) {
    			//System.out.println(s.charAt(i));
    			//System.out.println(s.indexOf(i));
        		rlts = s.charAt(i);
        		break;
        	} else {
        		//System.out.println(-1);
        		rlts = -1;
        	}
    		  		
    	}
    	return rlts;
    */
        int count=-1;
        if(s == null || s.length() < 1) {
            //return -1;
        	count = -1;
        }
        else if (s.length() == 1) {
            //return 0;
        	count = 0;
        } else {
        	for(char ch:s.toCharArray()){
        		System.out.println(ch);
        		if(s.indexOf(ch) == s.lastIndexOf(ch)){
                count = s.indexOf(ch);    
        		}//end of nested if
        	}//end for loop  
        }//end of if
        
        //If no unique character is found, count will still be -1  
        System.out.println(count);
        return count;
        
    }//end Method
}//end class




