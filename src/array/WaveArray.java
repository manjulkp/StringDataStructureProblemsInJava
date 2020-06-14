
package array;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 4, 7, 8, 9, 10 };

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i - 1] > arr[i]) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
			if (i < n - 1 && arr[i] < arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}

		System.out.println(Arrays.toString(arr));

	}
	public static int[] getPetNames()
	{
		int[] a = new int[5];
		return a;		
		
	}

}


