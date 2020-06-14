package array;

public class Minimumadjacentdifferenceinacirculararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 12, 13, 15, 10 };
		int n = arr.length;

		int dif = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {
			dif = Math.min(dif, Math.abs(arr[i + 1] - arr[i]));
		}

		dif = Math.min(dif, Math.abs(arr[n - 1] - arr[0]));

		System.out.println(dif);

	}

}
