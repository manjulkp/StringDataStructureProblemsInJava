package array;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		int d = 3;
		int n = arr.length;
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);

	}

	private static void reverse(int[] arr, int start, int end) {

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

///**right rotate
// * rotate(arr[], d, n)
//  reverseArray(arr[], 0, n-1) ;
//  reverse(arr[], 0, d-1);
//  reverse(arr[], d, n-1);
