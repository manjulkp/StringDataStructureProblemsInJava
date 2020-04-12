package Searching;

//Search an element is present in a sorted array .

public class BinarySearchToFindX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int n = arr1.length;
		int key = 3;
		System.out.println("Index of the element is : " + search(arr1, 0, n - 1, key));

	}
	
	public static int searchElement(int arr[],int low,int high,int x)
	{
		if(low<)
		return x;
		
	}

	public static int search(int arr[], int low, int high, int x) {
		if (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == x)
				return mid;

			if (x < arr[mid])
				return search(arr, low, mid - 1, x);
			else
				return search(arr, mid + 1, high, x);
		}
		return -1;
	}

}
