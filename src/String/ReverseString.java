package String;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "manjula";
		reverse(s);

	}

	public static void reverse(String s) {
		char str[] = s.toCharArray();

		int start = 0;
		int end = str.length - 1;

		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
//convert back to new String from reverse array
		System.out.println("the reverse of string is " + new String(str));

	}

}
