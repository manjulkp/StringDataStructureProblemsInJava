package String;

public class ReturnMatchIndex {

	// The function should return position where the target string
	// matches the string str

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "for";
		String s2 = "geeksforgeeks";
		System.out.println(getMatch(s2, s1));
	}

	public static int getMatch(String str, String pattern) {
		int N = str.length();
		int M = pattern.length();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (str.charAt(i + j) == pattern.charAt(j)) {
					if (j == (M - 1)) {
						return i;
					}
				} else {
					break;
				}
			}

		}

		return -1;
	}

}
