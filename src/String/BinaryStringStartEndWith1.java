package String;

public class BinaryStringStartEndWith1 {

	// Given a binary string S.
	// The task is to count the number of substrings that start and end with 1.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "00100101";

		getCount(string);

	}

	public static void getCount(String s) {
		char array[] = s.toCharArray();
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '1') {
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] == '1') {
						count++;
					}
				}
			}
		}

		System.out.println("the number of substring is " + count);
	}

}
