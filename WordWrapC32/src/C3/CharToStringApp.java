package C3;

public class CharToStringApp {

	public static void main(String[] args) {
		String manInTheArena = "It is not the critic who counts; not the man who points out how the strong man stumbles, or where the doer of deeds could have done them better. The credit belongs to the man who is actually in the arena, whose face is marred by dust and sweat and blood; who strives valiantly; who errs, who comes short again and again, because there is no effort without error and shortcoming; but who does actually strive to do the deeds; who knows great enthusiasms, the great devotions; who spends himself in a worthy cause; who at the best knows in the end the triumph of high achievement, and who at the worst, if he fails, at least fails while daring greatly, so that his place shall never be with those cold and timid souls who neither know victory nor defeat.";
				//String wrappedText = wrap(manInTheArena, 80);
				//System.out.println(wrappedText);
				System.out.println("\n\n");
				String wrappedTextThin = wrap(manInTheArena, 40);
				System.out.println(wrappedTextThin);
		
	}
	
	
	public static String wrap(String str, int w) {

		/*
		 * String nStr = "";
		 * 
		 * if (w <= 1 && str.length() <= 1) { nStr = str; return nStr; }
		 * 
		 * if (w == 1 && str.length() > 1) { // System.out.println(str); String nspStr =
		 * str.replace(" ", ""); // System.out.println(nspStr); int strL =
		 * nspStr.length(); // System.out.println(strL); for (int i = 0; i <= strL - 1;
		 * i++) { String end = i < strL - 1 ? "\n" : ""; nStr += nspStr.charAt(i) + end;
		 * } return nStr; }
		 * 
		 * if (w > 1 && str.length() > 1) { int strL = str.length(); int ptr = 0; if
		 * (strL >= w) { for (int i = ptr; i <= w - 1 + ptr; i++) { nStr +=
		 * str.charAt(i); nStr = w == str.length() ? nStr : nStr.trim(); } ptr += w;
		 * nStr += w == str.length() ? "" : "\n"; } if (strL - w <= w) { for (int i =
		 * strL - w - 1; i >= 0; i--) { nStr += str.charAt(i); } }
		 * 
		 * return nStr; }
		 * 
		 * return nStr; }
		 */
		
		// Ken's solution---
		//Base case is first part of if statement
		
		//System.out.println(wrap(str.substring(1).trim(), 2));
		if (w >= str.length()) {
			return str;
		} else {
			//this part of if works towards base case to end recursive calls
			int br = str.lastIndexOf(" ", w);
			if (br == -1) {
				br = w;
			}
			String finalStr = str.substring(0, br).trim() + "\n" + wrap(str.substring(br).trim(), w);
//		        System.out.println("br number " + br);
//		        System.out.println("sub0 string " + str.substring(0, br).trim());
//		        System.out.println("subBR string " +str.substring(br).trim());
			return finalStr;
		}

	}// end of wrap method

}// end of class
