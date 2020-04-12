package String;

public class KeyBoardTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "amazon";

		System.out.println(conversion(s));
	}

	public static String conversion(String s) {
		char array[] = s.toCharArray();

		String num[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		String result = "";

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[j].indexOf(array[i]) != -1) {
					String mapingNumber = Integer.toString(j + 2);
					result = result + mapingNumber;
				}
			}
		}

		return result;
	}

}
