package Searching;

public class FindElementInInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 10,20,30,40,50,60,90,100};
		
		int x = 20;
		
		System.out.println("the element is found at index" + findLength(arr,x) );

	}
	
	
	public static int search(int arr[], int low,int high,int x)
	{
		if(low<=high)
		{		

		int mid = low + (high -low)/2;
		
		
		if(arr[mid] == x)
			return mid;
		
		if(x<arr[mid])
			return search(arr, low,mid-1,x);
		else
			return search(arr, mid+1,high,x);
		
		}
		
		return -1;
		
	}

	
	public static int  findLength(int arr[],int element)
	{
		if(arr[0] == element)
			return 0;
		
		int index =1;
		
		while(element > arr[index])
		{
			index = index*2;
		}
		
		if(arr[index] == element)
			return index;
		else
			return search(arr,index/2,index,element);
			
		
	}

}
