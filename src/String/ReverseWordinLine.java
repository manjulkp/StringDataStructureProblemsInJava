package String;

import java.util.Arrays;

public class ReverseWordinLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "This is manjula";
		reverse(line);
	}

	public static void reverse(String s)

	{
		String words[] = s.split(" ");

		int start = 0;
		int end = words.length - 1;

		while (start < end) {
			String temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}

		System.out.println("the reverse of string is " + Arrays.toString(words));

	}

}
