package array;

public class LeaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;

		int leader = arr[n - 1];

		for (int i = n - 2; i > 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
			}
		}

		System.out.println(leader);

	}

}
