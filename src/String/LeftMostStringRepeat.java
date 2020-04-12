package String;

import java.util.HashMap;
import java.util.Map;

public class LeftMostStringRepeat {

	//Given a string, find the leftmost character that repeats.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks"; 
        
        System.out.println(findRepeating(str)); 
        
	}

	public static char findRepeating(String str)
	{
		Map<Character,Integer> map = new HashMap<>();
		for(int i =0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
				return str.charAt(i);
			}
			else
			{
				map.put(str.charAt(i), 1);
				
			}
		}
		
		
		return 0;
		
	}
}
