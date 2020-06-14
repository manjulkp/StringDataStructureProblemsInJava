package array;

import java.util.Arrays;

public class ArrayAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 5, 6, 7 };

		int n = a.length;

		int x = 18;

		a[n - 1] = x;

		System.out.println(Arrays.toString(a));

	}

}
