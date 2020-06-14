package String;

public class NaiveWithDistinctPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "AABABCDACAADAABAAABAA";
		String pat = "ABCD";
		search(txt, pat);

	}

	static void search(String txt, String pat) {
		int M = pat.length();
		int N = txt.length();

		int txtIndex = 0;

		while (txtIndex <= N - M) {
			int patIndex;
			for (patIndex = 0; patIndex < M; patIndex++) {
				if (txt.charAt(txtIndex + patIndex) != pat.charAt(patIndex))
					break;
			}
			if (patIndex == M) {
				System.out.println("Pattern found at index " + txtIndex);
				txtIndex = txtIndex + M;
			} else if (patIndex == 0) {

				txtIndex = txtIndex + 1;

			} else {
				txtIndex = txtIndex + patIndex;
			}
		}
	}
}
