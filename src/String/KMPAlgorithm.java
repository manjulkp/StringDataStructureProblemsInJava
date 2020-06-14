package String;

public class KMPAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "ABABDABACDABABCABAB";
		String pat = "ABAB";

		match(txt, pat);

	}

	// if str[i] and str[len] match lps[i] = len+1 ,len++
	// if not matching then
	// step 1: if len =0 ---lps[i] ==0
	// step2 : else len = lps[len-1] and compare str[i] and str[len]

	public static int[] fillLPS(String s, int lps[]) {

		int n = s.length();

		lps[0] = 0;
		int len = 0;
		int i = 1;

		while (i < n) {
			// if both are same
			if (s.charAt(i) == s.charAt(len)) {
				lps[i] = len + 1;
				len++;
				i++;
			}
			// case where they are not same
			else {
				if (len == 0) {
					lps[i] = 0;
					i++;
				} else {
					len = lps[len - 1];
				}

			}
		}

		return lps;

	}

	public static void match(String s, String pat) {
		int N = s.length();
		int M = pat.length();

		int lps[] = new int[M];
		int lpsCollected[] = fillLPS(pat, lps);

		int iOfText = 0;
		int jOfPat = 0;

		while (iOfText < N) {
			if (s.charAt(iOfText) == pat.charAt(jOfPat)) {
				iOfText++;
				jOfPat++;

			}
			if (jOfPat == M) {
				System.out.print("Found pattern at index " + (iOfText - jOfPat));
				jOfPat = lps[jOfPat - 1];
			} else {
				if (s.charAt(iOfText) != pat.charAt(jOfPat) && iOfText < N) {
					if (jOfPat == 0) {
						iOfText++;

					} else {
						jOfPat = lps[jOfPat - 1];
					}
				}
			}
			// if there is mismatch then j should have value equal to lps[j]

		}

	}

}
