package String;

public class NaivePatternSearch {

	//Implement strstr problem is same as this 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "AABAACAADAABAAABAAAABA";
		String pat = "AABA";
		search(txt, pat);
	}

	public static void search(String s, String pattern) {
		int M = pattern.length();
		int N = s.length();

		for (int i = 0; i <= N - M; i++) {
			int j;

			for (j = 0; j < M; j++) {
				if (s.charAt(i + j) != pattern.charAt(j))
					break;

			}

			if (j == M) {
				System.out.println("the pattern is matched at " + i);
			}
		}
	}

}
