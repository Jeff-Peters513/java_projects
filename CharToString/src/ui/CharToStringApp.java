package ui;

public class CharToStringApp {

	public static String wrap(String str, int w) {
		
		//String str = "xaxax";
		//int w = 2;
		int idxUnits = w;

		String u = "";

		char[] c = str.toCharArray();

//		System.out.println(str);
//		System.out.println(c);
//		System.out.println(c[0]);

		int rem = c.length;
		int cycles = rem - idxUnits;

		for (int j = 1; j <= cycles && cycles >= 0; j++) {

			for (int i = 0; i <= idxUnits - 1; i++) {
				u += c[i];
			}
			if (cycles > 0) {
				u += "\n";
				
			}
		}
		return u;
	}
	// end of attempt one
	
	/*
	    String result = "";
	    int lastdelimPos = 0;
	    String deliminator = "\n";
	    for (String token : str.split(" ", -1)) {
	        if (result.length() - lastdelimPos + token.length() > w) {
	            result = result + deliminator + token;
	            lastdelimPos = result.length() + 1;
	        }
	        else {
	            result += (result.isEmpty() ? "" : " ") + token;
	        }
	    }
	    return result;
		*/	
	
	}

