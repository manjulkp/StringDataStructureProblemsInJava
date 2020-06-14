package array;

import java.util.Arrays;

public class MeanAndMedianofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
		int n = a.length;
		double sum = 0;

		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}

		double mean = sum /  n;

		System.out.println("mean is " + mean);

		if (n >> 1 != 0) {
			System.out.println("median is " + a[n / 2]);
		} else {

			System.out.println("median is " + (double) (a[(n - 1) / 2] + a[n / 2]) / 2);
		}

	}

}
