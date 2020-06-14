package String;

import java.util.Arrays;

public class LongestSubStringWithDistinctBetterSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABDEFGABEF";
		System.out.println(longestDistinct(s));
		System.out.println(longestDistinctWithBetterApproach(s));

	}

	public static int longestDistinct(String s) {
		int res = 0;
		int n = s.length();

		int prevOccuredChar[] = new int[256];
		Arrays.fill(prevOccuredChar, -1);
		
        //max distinct occuring at j is (maxEnd + 1) if jth char as not occured in that length
		// if present then ---- j-previous occured indexof jth char +1
		int i = 0;

		for (int j = 0; j < n; j++) {

			// doing to check if it is previously present so compare index of i and j if jis
			// less that it is not occured
			i = Math.max(i, prevOccuredChar[s.charAt(j)] + 1);

			int maxEnd = j - i + 1;
			res = Math.max(res, maxEnd);
			prevOccuredChar[s.charAt(j)] = j;
		}

		return res;

	}

	public static int longestDistinctWithBetterApproach(String s) {
		int res = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			boolean visited[] = new boolean[256];
			Arrays.fill(visited, false);
			for (int j = i; j < n; j++) {
				if (visited[s.charAt(j)] == false) {
					visited[s.charAt(j)] = true;
				} else {
					res = Math.max(res, j - 1 - i + 1);
					break;
				}
			}
		}
		return res;
	}

}
