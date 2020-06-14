package array;

import java.util.Arrays;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };

		int n = arr.length;

		int temp[] = new int[n];
		int end = n - 1;
		int start = 0;
	
		
		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				temp[i] = arr[end];
				end--;
			} else {
				temp[i] = arr[start];
				start++;
			}

		}

		System.out.println(Arrays.toString(temp));

	}

}
