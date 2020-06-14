package String;

import java.util.Arrays;

public class ConstructLongestPrefixSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prefixSuffixArrayBuild("ababacab");
	}

	public static void prefixSuffixArrayBuild(String s) {
		int lpsArray[] = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			//System.out.println("i is " +i);
			lpsArray[i] = getPossibleLPSAtEachIndex(s, i);
		}
		System.out.println("the longest posible proper prefix and suffix is " + Arrays.toString(lpsArray));
	}

	public static int getPossibleLPSAtEachIndex(String s, int i) {
		for (int j = i ; j > 0; j--) {
			//System.out.println("j is---------- " +j);
			boolean flag = true;

			for (int len = 0; len < j; len++) {
				if (s.charAt(len) != s.charAt(i - j + len)) {
					flag = false;
				}
			}
			if (flag == true) {
				return j;
			}

		}

		return 0;
	}
}
