package String;

import java.util.HashMap;

public class MinimumIndexedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "geeksforgeeks";
		String pat = "set";
		
		System.out.println(getMinIndex(txt,pat));
	}

	
	public static char getMinIndex(String text,String pattern)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<text.length();i++)
		{
			if(!map.containsKey(text.charAt(i)))
			{
				map.put(text.charAt(i), i);
			}
			
		}
		
		int minIndex = Integer.MAX_VALUE;
		
		for(int i=0;i< pattern.length();i++)
		{
			if(map.containsKey(pattern.charAt(i)) && map.get(pattern.charAt(i)) < minIndex  )
			{
				minIndex = map.get(pattern.charAt(i));
			}
		}
		
		return text.charAt(minIndex);
	}
	
	
}
