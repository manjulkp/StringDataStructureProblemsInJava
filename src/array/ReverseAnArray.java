package array;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr, arr.length);

	}

	private static void reverse(int[] arr, int length) {

		int start = 0;
		int end = arr.length - 1;

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
