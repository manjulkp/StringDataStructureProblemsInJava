package array;

public class FirstMaxSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };

		int n = arr.length;

		int max1 = Integer.MIN_VALUE;
		int max2 = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else {
				if (arr[i] > max2 && arr[i] != max1) {
					max2 = arr[i];
				}
			}
		}

		System.out.println(max1);
		System.out.println(max2);

	}

}
