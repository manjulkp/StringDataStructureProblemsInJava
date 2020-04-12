package Searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,3,3,3,3,4};
		int n = arr.length;
		
		int find = 3;
		occurance(arr,n,find);
		

	}
	
	public static void occurance(int arr[],int n ,int find )
	{
		HashMap <Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			int key = arr[i];
			if(m.containsKey(key))
			{
				m.put(arr[i], m.get(arr[i])+1);
			}
			else
			{
				m.put(arr[i], 1);
			}
		}
		 
		System.out.println("the element " + find + " occurs " + m.get(find));
		
		for(Entry<Integer, Integer> a : m.entrySet())
		{
			System.out.println( a.getKey() + "   " + a.getValue());
		}
		
	}

}
