package array;

import java.util.Arrays;

public class ReverseInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;

		for (int i = 0; i < arr.length; i = i + k) {
			int start = i;
			int end = Math.min(i + k - 1, arr.length - 1);

			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}

			System.out.println(Arrays.toString(arr));

		}

	}

}
