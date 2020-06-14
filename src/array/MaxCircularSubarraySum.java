package array;

public class MaxCircularSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 11, 10, -20, 5, -3, -5, 8, -13, 10 };
		System.out.println(circularSum(a, a.length));

	}

	public static int circularSum(int arr[], int n) {
		int max_kadene = kadene(arr, n);
		int wrap_max = 0;

		for (int i = 0; i < n; i++) {
			wrap_max = wrap_max + arr[i];
			arr[i] = -arr[i];
		}

		wrap_max = wrap_max + kadene(arr, n);

		return (wrap_max > max_kadene) ? wrap_max : max_kadene;
	}

	public static int kadene(int arr[], int n) {
		int max_so_far = 0;
		int max_ends_here = 0;

		for (int i = 0; i < n; i++) {
			max_ends_here = max_ends_here + arr[i];
			if (max_ends_here < 0)
				max_ends_here = 0;
			if (max_so_far < max_ends_here)
				max_so_far = max_ends_here;
		}

		return max_so_far;

	}

}
