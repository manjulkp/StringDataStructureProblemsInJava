package Searching;

public class ElementinRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
	       int n = arr1.length;
	       
	       int x = 8;
	       
	       System.out.println(pivotal(arr1,0,n));
	       
	       int pivot = pivotal(arr1,0,n);
	       
	       //no rotation so pivot is -1;
	       if(pivot == -1)
	       {
	    	   search(arr1, 0,  n-1, x);
	       }
	       
	       if (arr1[pivot] == x) 
	    	   System.out.println(pivot); 
	       if (arr1[0] <= x) 
	    	   System.out.println( search(arr1, 0, pivot-1, x)); 
	       System.out.println(search(arr1, pivot+1, n-1, x));
	       
	       
	}
	
	public static int  pivotal(int arr[],int low,int high)
	{
		if(high<low)
			return -1;
		
		if(high ==low)
		{
			return low;
		}
		
		int mid = (low + high)/2;
		
		if(arr[mid] > arr[mid+1] && mid < high)
			return mid;
		
		if(arr[mid] < arr[mid-1] && mid > low)
			return mid-1;
		
		  
	       if(arr[mid] >= arr[low])
	    	   return pivotal(arr, mid+1, high);
	       
	       else
	       
	    	   return pivotal(arr, low, mid-1);
	       
	       
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
