package getUniqueChar;

public class toCharArrayAPP {

	public static void main(String[] args) {
		        String s = "GeeksforGeeks";
		        char[] gfg = s.toCharArray();
		        
		        
		        /*
		        //using standard for loop
		        for (int i = 0; i < gfg.length; i++) {
		            System.out.println(gfg[i]);
		        }
		        */
		        //using enhance for loop
		        for (char c : gfg) {
		            System.out.println(c);
		        }
		    
		}

	}


