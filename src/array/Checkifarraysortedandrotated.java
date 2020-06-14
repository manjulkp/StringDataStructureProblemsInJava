package array;

public class Checkifarraysortedandrotated {

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int n = arr1.length;
		findMin(arr1, n);
	}

	public static void findMin(int arr[], int n) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		boolean flag1 = true;
		for (int j = 1; j < index; j++) {
			if (arr[j] < arr[j - 1]) {
				flag1 = false;
				break;
			}
		}
		boolean flag2 = true;
		for (int j = index + 1; j < n; j++) {
			if (arr[j] < arr[j - 1]) {
				flag2 = false;
				break;
			}
		}
		if (index == 0) {
			System.out.println("the array is not rotated but it is sorted");
			return;
		}

		// Check if last element of the array
		// is smaller than the element just
		// before the element at minIndex

		if ((flag1 == true) && (flag2 == true) && (arr[n - 1] < arr[index - 1])) {
			System.out.println("the array is rotated and  it is sorted");
			return;
		} else {
			System.out.println("the array is not rotated but  it is sorted");
			return;
		}

	}

}
