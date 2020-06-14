package array;
/**
 * Given an array arr[] of N positive integers. The task is to find the maximum for every adjacent pairs in the array.
 * @author purushi1.macbook
 *
 */
public class StrongestNeighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1 ,2, 2 ,3, 4 ,5};
		
		int n = arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			System.out.println(Math.max(arr[i], arr[i+1]));
		}

	}

}
