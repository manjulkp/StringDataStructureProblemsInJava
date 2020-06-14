package array;

import java.util.Arrays;

public class InsertAnElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 5, 6, 7 };

		int n = a.length;

		int x = 18;

		int pos = 3;

		for (int i = n - 1; i >pos; i--) {
			a[i] = a[i - 1];
		}
		System.out.println(Arrays.toString(a));
		a[pos] = x;

		System.out.println(Arrays.toString(a));

	}

}
