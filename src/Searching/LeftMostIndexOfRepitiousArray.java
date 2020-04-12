package Searching;

import java.util.HashSet;

public class LeftMostIndexOfRepitiousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = { 1, 2, 3,3,3,3,3}; 
	       int n = arr1.length; 
	       
	       indexOf(arr1,n);

	}
	
	public static void indexOf(int arr[],int n)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i =0;i<n;i++)
		{
			if(s.contains(arr[i]))
			{
				System.out.println("The left most index is " + i);
				break;
			}
			else
			{
				s.add(arr[i]);
			}
		}
		
	}

}
