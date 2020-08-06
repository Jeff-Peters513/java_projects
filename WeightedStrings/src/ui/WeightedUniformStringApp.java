package ui;

public class WeightedUniformStringApp {

	public static void main(String[] args) {
		// Hacker Rank challenge
		String s = "abccddde"; // read into code in main "method"
		int queriesCount = 6; // read into code in main "method"
		int[] queries = new int[queriesCount]; // created and setting size of array
		queries[0] = 1;
		queries[1] = 3;
		queries[2] = 12;
		queries[3] = 5;
		queries[4] = 9;
		queries[5] = 10;

		System.out.println(s);
		System.out.println(queriesCount + " queriesCount");

		for (int i = 0; i < queriesCount; i++) {
			System.out.println(queries[i]);
		}

		String[] result = weightedUniformStrings(s, queries);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
			
	}

	static String[] weightedUniformStrings(String s, int[] queries) {
		// string s passed in along with queries requests
		// process
		// print out

//		for (int i = 0; i <= queries.length; i++) {
//			if (queries[0] = ) {
//
//			} else {
//				// exit?
//			}
//
//		}

		String[] result = {"yes", "no", "yes", "no", "yes", "no"};

		return result;
	}

}
