package String;

import java.util.Arrays;

/**
 * 
 * @author purushi1.macbook Case-specific Sorting of Strings Given a string S
 *         consisting of uppercase and lowercase characters. The task is to sort
 *         uppercase and lowercase letters separately such that if the ith place
 *         in the original string had an Uppercase character then it should not
 *         have a lowercase character after being sorted and vice versa.
 *
 */

public class CaseSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gEeksfOrgEEkS";
		System.out.println(sortCharacter(s));

	}

	public static String sortCharacter(String s) {
		char array[] = s.toCharArray();

		int lowerCount = 0, upperCount = 0;

		for (char c : array) {
			if (Character.isUpperCase(c)) {
				upperCount++;
			} else {
				lowerCount++;
			}
		}

		char lowerArray[] = new char[lowerCount];
		char upperArray[] = new char[upperCount];

		// Reset the count
		lowerCount = 0;
		upperCount = 0;

		for (char c : array) {
			if (Character.isUpperCase(c)) {
				upperArray[upperCount++] = c;
			} else {
				lowerArray[lowerCount++] = c;
			}
		}

		Arrays.sort(upperArray);
		Arrays.sort(lowerArray);
		// If original string is havng lowercase characters, then print the character
		// from lowercase array else
		// from the uppercase array and increment the pointer for that array.

		// Reset the count
		lowerCount = 0;
		upperCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (Character.isUpperCase(array[i])) {
				array[i] = upperArray[upperCount++];
			} else {
				array[i] = lowerArray[lowerCount++];
			}
		}

		return new String(array);

	}

}
