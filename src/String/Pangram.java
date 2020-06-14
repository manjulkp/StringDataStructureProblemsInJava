package String;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(check("The quick brown fox jumps over the lazy dog"));
	}

	public static boolean check(String str) {

		boolean[] mark = new boolean[26];

		int index = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';

			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')

				index = str.charAt(i) - 'a';
			else
				// if it not english alphabets then just continue
				continue;

			// mark that index in mark array as true
			mark[index] = true;

		}

		for (int i = 0; i <= 26; i++)
			if (mark[i] == false)
				return (false);
		return true;

	}

}
